package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CreateShipmentRequestDto {
    List<ShipmentDto> shipments;

    @JsonProperty("pickup_location")
    LocationDto pickupLocation;
}
