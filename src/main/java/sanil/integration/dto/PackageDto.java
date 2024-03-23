package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class PackageDto {
    @JsonProperty("status")
    private String status;
    @JsonProperty("client")
    private String client;
    @JsonProperty("sort_code")
    private String sortCode;
    @JsonProperty("remarks")
    private List<String> remarks;
    @JsonProperty("waybill")
    private String waybill;
    @JsonProperty("cod_amount")
    private Double codAmount;
    @JsonProperty("payment")
    private String payment;
    @JsonProperty("serviceable")
    private Boolean serviceable;
    @JsonProperty("refnum")
    private String refNum;
}
