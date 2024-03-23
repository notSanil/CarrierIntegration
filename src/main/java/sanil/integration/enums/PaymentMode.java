package sanil.integration.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMode {
    CashOnDelivery("COD"),
    Prepaid("Prepaid");

    private final String code;

    PaymentMode(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }
}
