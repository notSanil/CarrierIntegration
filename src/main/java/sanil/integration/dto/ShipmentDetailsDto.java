package sanil.integration.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class ShipmentDetailsDto {
    @JsonProperty("PickUpDate")
    private String pickUpDate;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("DestRecieveDate")
    private String destReceiveDate;
    @JsonProperty("Scans")
    List<Map<String, ScanDto>> scans;
    @JsonProperty("Status")
    private StatusDto status;
    @JsonProperty("ReturnPromisedDeliveryDate")
    private String returnPromisedDeliveryDate;
    @JsonProperty("Ewaybill")
    private List<String> ewayBill;
    @JsonProperty("InvoiceAmount")
    private Integer invoiceAmount;
    @JsonProperty("ChargedWeight")
    private Integer chargedWeight;
    @JsonProperty("PickedupDate")
    private String pickedUpDate;
    @JsonProperty("DeliveryDate")
    private String deliveryDate;
    @JsonProperty("SenderName")
    private String senderName;
    @JsonProperty("AWB")
    private String waybill;
    @JsonProperty("DispatchCount")
    private Integer dispatchCount;
    @JsonProperty("OrderType")
    private String orderType;
    @JsonProperty("ReturnedDate")
    private String returnedDate;
    @JsonProperty("ExpectedDeliveryDate")
    private String expectedDeliveryDate;
    @JsonProperty("RTOStartedDate")
    private String rtoStartedDate;
    @JsonProperty("Extras")
    private String extras;
    @JsonProperty("FirstAttemptDate")
    private String firstAttemptDate;
    @JsonProperty("ReverseInTransit")
    private Boolean reverseInTransit;
    @JsonProperty("Quantity")
    private String quantity;
    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Consignee")
    private ConsigneeDto consignee;
    @JsonProperty("ReferenceNo")
    private String referenceNumber;
    @JsonProperty("OutDestinationDate")
    private String outDestinationDate;
    @JsonProperty("CODAmount")
    private Integer codAmount;
    @JsonProperty("PromisedDeliveryDate")
    private String promisedDeliveryDate;
    @JsonProperty("PickupLocation")
    private String pickupLocation;
    @JsonProperty("OriginRecieveDate")
    private String originRecieveDate;
}
