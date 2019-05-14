package fr.mspr.dev.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "question")
public class Question implements Serializable {

    @Id
    private String uuid;
    private String name;
    private String description;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<QuestionChoice> questionChoice;

    @ManyToOne
    @JoinColumn(name = "uuid_questionType")
    private QuestionType questionType;

    @ManyToOne
    @JoinColumn(name = "uuid_form")
    private Form form;

    public Question() {
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
}
