package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import sanil.integration.enums.ShipmentMode;
import sanil.integration.enums.ShipmentStatus;

@Data
@AllArgsConstructor
public class CostRequestDto {

    @NonNull
    @JsonProperty("shipment_mode")
    private ShipmentMode shipmentMode;

    @JsonProperty("dest_pin")
    @NonNull
    private Integer destinationPin;

    @JsonProperty("origin_pin")
    @NonNull
    private Integer originPin;

    @JsonProperty("weight")
    @NonNull
    private Integer weight;

    @JsonProperty("shipment_status")
    @NonNull
    private ShipmentStatus shipmentStatus;
}
