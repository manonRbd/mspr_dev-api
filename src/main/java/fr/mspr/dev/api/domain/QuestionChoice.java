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

    @Column(nullable = false)
    private String value;

    @ManyToOne
    @JoinColumn(name = "uuid_question", nullable = false, updatable=false, insertable = false)
    private Question question;

    @Column(nullable = false)
    private String uuid_question;

    public QuestionChoice() {
    }

    public String getUuid_question() {
        return uuid_question;
    }

    public void setUuid_question(String uuid_question) {
        this.uuid_question = uuid_question;
    }

    public String getUuid() {
        return uuid;
    }


    public void setUuid(String uuid) {
        this.uuid = uuid;
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
