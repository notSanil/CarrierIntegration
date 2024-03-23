package sanil.integration.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CreateShipmentDto {
    @JsonProperty("cash_pickups_count")
    private Integer cashPickupsCount;
    @JsonProperty("package_count")
    private Integer packageCount;
    @JsonProperty("upload_wbn")
    private String uploadWbn;
    @JsonProperty("replacement_count")
    private Integer replacementCount;
    @JsonProperty("rmk")
    private String remarks;
    @JsonProperty("pickups_count")
    private Integer pickupsCount;
    @JsonProperty("packages")
    private List<PackageDto> packages;
    @JsonProperty("cash_pickups")
    private Integer cashPickups;
    @JsonProperty("cod_count")
    private Integer codCount;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("prepaid_count")
    private Integer prepaidCount;
    @JsonProperty("error")
    private Boolean error;
    @JsonProperty("cod_amount")
    private Integer codAmount;
}
