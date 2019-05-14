package fr.mspr.dev.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "questionType")
public class QuestionType implements Serializable {

    @Id
    private String uuid;
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
}
