package sanil.integration.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ShipmentMode {
    Standard("S"),
    Express("E");

    private final String code;

    ShipmentMode(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }
}
