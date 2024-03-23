package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ConsigneeDto {
    @JsonProperty("City")
    private String city;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Address1")
    private List<String> address1;
    @JsonProperty("Address2")
    private List<String> address2;
    @JsonProperty("Address3")
    private String address3;
    @JsonProperty("PinCode")
    private Integer pincode;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Telephone2")
    private String telephone2;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Telephone1")
    private String telephone1;
}
