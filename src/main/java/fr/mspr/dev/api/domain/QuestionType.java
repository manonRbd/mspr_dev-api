package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "questionType")
public class QuestionType implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private String uuid;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "questionType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Question> question;

    public QuestionType() {
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }
}
