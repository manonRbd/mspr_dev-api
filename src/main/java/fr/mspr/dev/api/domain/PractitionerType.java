package fr.mspr.dev.api.domain;

public enum PractitionerType {
    GENERALISTE("GENERALISTE"),
    PHARMACIE("PHARMACIE"),
    SPECIALISTE("SPECIALISTE");

    private final String value;

    PractitionerType(String value) {
        this.value = value;
    }
}