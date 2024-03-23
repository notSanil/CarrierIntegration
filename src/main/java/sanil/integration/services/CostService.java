package sanil.integration.services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import sanil.integration.dto.CostDto;
import sanil.integration.dto.CostRequestDto;

import java.util.List;

import static sanil.integration.constants.ApiConstants.COST_API_ADDRESS;
import static sanil.integration.constants.StatusConstants.API_FAIL;

@Service
public class CostService {

    @Value("${delhivery.token}")
    static String token;
    WebClient webClient = WebClient.create();


    public Integer GetCost(CostRequestDto costRequestDto) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Token " + token);

        UriComponents costApiUriComponents = UriComponentsBuilder
                .fromHttpUrl(COST_API_ADDRESS)
                .queryParam("md", costRequestDto.getShipmentMode().getCode())
                .queryParam("ss", costRequestDto.getShipmentStatus().getCode())
                .queryParam("d_pin", costRequestDto.getDestinationPin())
                .queryParam("o_pin", costRequestDto.getOriginPin())
                .queryParam("cgm", costRequestDto.getWeight())
                .build();

        ResponseEntity<List<CostDto>> response =
                webClient
                        .get()
                        .uri(costApiUriComponents.toUri())
                        .headers(httpHeaders -> httpHeaders.addAll(headers))
                        .retrieve()
                        .toEntity(new ParameterizedTypeReference<List<CostDto>>() {
                        })
                        .block();

        if (response.getStatusCode().isError()) {
            throw new Exception(API_FAIL);
        }

        List<CostDto> costDto = response.getBody();

        return costDto.get(0).getTotalAmount();
    }

}
