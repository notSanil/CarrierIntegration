package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TaxDataDto {
    @JsonProperty("swacch_bharat_tax")
    private Integer swacchBharatTax;
    @JsonProperty("IGST")
    private Integer igst;
    @JsonProperty("SGST")
    private Integer sgst;
    @JsonProperty("service_tax")
    private Integer serviceTax;
    @JsonProperty("krishi_kalyan_cess")
    private Integer krishiKalyanCess;
    @JsonProperty("CGST")
    private Integer cgst;
}
