package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "questionChoice")
public class QuestionChoice implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
