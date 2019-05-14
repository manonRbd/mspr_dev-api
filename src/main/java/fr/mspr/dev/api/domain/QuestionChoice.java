package fr.mspr.dev.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "questionChoice")
public class QuestionChoice implements Serializable {

    @Id
    private String uuid;
    private String value;

    @ManyToOne
    @JoinColumn(name = "uuid_question")
    private Question question;

    public QuestionChoice() {
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return value;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String value) {
        this.value = value;
    }
}
