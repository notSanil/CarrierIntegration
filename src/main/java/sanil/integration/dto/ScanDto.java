package sanil.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScanDto {
    @JsonProperty("ScanDateTime")
    private String scanDateTime;
    @JsonProperty("ScanType")
    private String scanType;
    @JsonProperty("Scan")
    private String scan;
    @JsonProperty("StatusDateTime")
    private String statusDateTime;
    @JsonProperty("ScannedLocation")
    private String scannedLocation;
    @JsonProperty("StatusCode")
    private String statusCode;
    @JsonProperty("Instructions")
    private String instructions;
}
