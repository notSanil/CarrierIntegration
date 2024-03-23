package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ShipmentDataDto {

    @JsonProperty("ShipmentData")
    private List<Map<String, ShipmentDetailsDto>> shipmentData;
}
