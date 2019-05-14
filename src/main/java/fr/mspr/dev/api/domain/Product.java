package fr.mspr.dev.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    private String uuid;
    private String name;
    private Boolean generic;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Sales> sales;

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
