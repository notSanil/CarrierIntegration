package sanil.integration.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import sanil.integration.enums.PaymentMode;

@Data
@AllArgsConstructor
public class UpdateShipmentRequestDto {
    @JsonProperty("waybill")
    @NonNull
    private String waybill;

    @JsonProperty("phone")
    @Nullable
    private String phone;

    @Nullable
    @JsonProperty("name")
    private String name;

    @Nullable
    @JsonProperty("add")
    private String address;

    @Nullable
    @JsonProperty("product_details")
    private String productDetails;

    @Nullable
    @JsonProperty("shipment_length")
    private Double shipmentLength;

    @Nullable
    @JsonProperty("shipment_width")
    private Double shipmentWidth;

    @Nullable
    @JsonProperty("shipment_height")
    private Double shipmentHeight;

    @Nullable
    @JsonProperty("weight")
    private Integer weight;

    @Nullable
    @JsonProperty("pt")
    private PaymentMode paymentMode;

    @Nullable
    @JsonProperty("cod")
    private Integer cashOnDelivery;
}
