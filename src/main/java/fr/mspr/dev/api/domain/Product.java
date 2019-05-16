package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private String uuid;
    private String name;
    private Boolean generic;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Sale> sales;

    public Product() {
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Boolean getGeneric() {
        return generic;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeneric(Boolean generic) {
        this.generic = generic;
    }
}
