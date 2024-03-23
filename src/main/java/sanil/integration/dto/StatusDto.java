package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StatusDto {
    @JsonProperty("Status")
    private String status;
    @JsonProperty("StatusLocation")
    private String statusLocation;
    @JsonProperty("StatusDateTime")
    private String statusDateTime;
    @JsonProperty("RecievedBy")
    private String recievedBy;
    @JsonProperty("StatusCode")
    private String statusCode;
    @JsonProperty("StatusType")
    private String statusType;
    @JsonProperty("Instructions")
    private String instructions;
}
