package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "question")
public class Question implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private String uuid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<QuestionChoice> questionChoice;

    @ManyToOne
    @JoinColumn(name = "uuid_questionType", nullable = false, updatable=false, insertable = false)
    private QuestionType questionType;

    @Column(nullable = false)
    private String uuid_questionType;

    @ManyToOne
    @JoinColumn(name = "uuid_form", nullable = false, updatable=false, insertable = false)
    private Form form;

    @Column(nullable = false)
    private String uuid_form;

    public Question() {
    }

    public String getUuid_questionType() {
        return uuid_questionType;
    }

    public void setUuid_questionType(String uuid_questionType) {
        this.uuid_questionType = uuid_questionType;
    }

    public String getUuid_form() {
        return uuid_form;
    }

    public void setUuid_form(String uuid_form) {
        this.uuid_form = uuid_form;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<QuestionChoice> getQuestionChoice() {
        return questionChoice;
    }

    public void setQuestionChoice(List<QuestionChoice> questionChoice) {
        this.questionChoice = questionChoice;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }
}
