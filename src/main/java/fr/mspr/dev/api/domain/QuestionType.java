package fr.mspr.dev.api.domain;

public enum QuestionType {
    MULTIPLE("MULTIPLE"),
    UNIQUE("UNIQUE"),
    FREE("FREE");

    private final String value;

    QuestionType(String value) {
        this.value = value;
    }
}