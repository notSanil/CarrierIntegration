package sanil.integration.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import sanil.integration.dto.ShipmentDataDto;


import static sanil.integration.constants.ApiConstants.TRACK_API_ADDRESS;
import static sanil.integration.constants.StatusConstants.API_FAIL;

@Service
public class TrackingService {

    @Value("${delhivery.token}")
    static String token;

    WebClient webClient = WebClient.create();

    public ShipmentDataDto GetTrackingDetails(String waybill) throws Exception {
        UriComponents trackShipmentApiUriComponents = UriComponentsBuilder
                .fromHttpUrl(TRACK_API_ADDRESS)
                .queryParam("token", token)
                .queryParam("waybill", waybill)
                .build();

        ResponseEntity<ShipmentDataDto> response = webClient
                .get()
                .uri(trackShipmentApiUriComponents.toUri())
                .retrieve()
                .toEntity(ShipmentDataDto.class)
                .block();

        if (response.getStatusCode().isError()) {
            throw new Exception(API_FAIL);
        }

        return response.getBody();
    }
}
