package sanil.integration.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ShipmentStatus {
    Delivered("Delivered"),
    ReturnToOrigin("RTO"),
    DeliveredToOrigin("DTO");

    private final String code;

    ShipmentStatus(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }
}
