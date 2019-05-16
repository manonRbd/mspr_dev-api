package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "practitionerType")
public class PractitionerType implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private String uuid;
    private String name;

    @OneToMany(mappedBy = "practitionerType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Practitioner> practitionerList;

    public PractitionerType() {
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

    public List<Practitioner> getPractitionerList() {
        return practitionerList;
    }

    public void setPractitionerList(List<Practitioner> practitionerList) {
        this.practitionerList = practitionerList;
    }
}
