package sanil.integration.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import sanil.integration.dto.CreateShipmentDto;
import sanil.integration.dto.CreateShipmentRequestDto;
import sanil.integration.dto.UpdateShipmentRequestDto;

import java.util.HashMap;
import java.util.Map;

import static sanil.integration.constants.ApiConstants.CREATE_SHIPMENT_API_ADDRESS;
import static sanil.integration.constants.ApiConstants.UPDATE_SHIPMENT_API_ADDRESS;
import static sanil.integration.constants.StatusConstants.API_FAIL;
import static sanil.integration.constants.StatusConstants.SUCCESS;

@Service
public class ShipmentService {

    @Value("${delhivery.token}")
    static String token;

    WebClient webClient = WebClient.create();

    public CreateShipmentDto CreateShipment(CreateShipmentRequestDto createShipmentRequestDto) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Token " + token);

        UriComponents createShipmentApiUriComponents = UriComponentsBuilder
                .fromHttpUrl(CREATE_SHIPMENT_API_ADDRESS).build();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(createShipmentRequestDto);
        String body = "format=json&data=" + json;

        ResponseEntity<CreateShipmentDto> response = webClient
                .post()
                .uri(createShipmentApiUriComponents.toUri())
                .headers(httpHeaders-> httpHeaders.addAll(headers))
                .bodyValue(body)
                .retrieve()
                .toEntity(CreateShipmentDto.class)
                .block();

        if (response.getStatusCode().isError()) {
            throw new Exception(API_FAIL);
        }

        return response.getBody();
    }

    public String UpdateShipment(UpdateShipmentRequestDto updateShipmentRequestDto) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Token " + token);

        UriComponents updateShipmentApiUriComponents = UriComponentsBuilder
                .fromHttpUrl(UPDATE_SHIPMENT_API_ADDRESS).build();

        ResponseEntity<String> response = webClient
                .post()
                .uri(updateShipmentApiUriComponents.toUri())
                .headers(httpHeaders-> httpHeaders.addAll(headers))
                .body(BodyInserters.fromValue(updateShipmentRequestDto))
                .retrieve()
                .toEntity(String.class)
                .block();

        if (response.getStatusCode().isError()) {
            throw new Exception(API_FAIL);
        }

        return SUCCESS;
    }

    public String DeleteShipment(String waybill) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Token " + token);

        UriComponents updateShipmentApiUriComponents = UriComponentsBuilder
                .fromHttpUrl(UPDATE_SHIPMENT_API_ADDRESS).build();

        Map<String, String> body = new HashMap<>();
        body.put("waybill", waybill);
        body.put("cancellation", "true");

        ResponseEntity<String> response = webClient
                .post()
                .uri(updateShipmentApiUriComponents.toUri())
                .body(BodyInserters.fromValue(body))
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .toEntity(String.class)
                .block();

        if (response.getStatusCode().isError()) {
            throw new Exception(API_FAIL);
        }

        return SUCCESS;
    }
}
