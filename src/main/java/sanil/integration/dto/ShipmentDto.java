package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import sanil.integration.enums.AddressType;
import sanil.integration.enums.PaymentMode;

@Data
@AllArgsConstructor
public class ShipmentDto {
    @JsonProperty("add")
    private String address;
    @JsonProperty("address_type")
    private AddressType addressType;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("payment_mode")
    private PaymentMode paymentMode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pin")
    private String pin;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("country")
    private String country;
    @JsonProperty("cod_amount")
    private Double codAmount;
    @JsonProperty("waybill")
    private String waybill;
    @JsonProperty("shipping_mode")
    private String shipmentMode;
}
