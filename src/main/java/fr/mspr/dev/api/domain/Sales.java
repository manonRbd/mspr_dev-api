package fr.mspr.dev.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sales")
public class Sales implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "uuid_practitioner")
    private Practitioner practitioner;

    @Id
    @ManyToOne
    @JoinColumn(name = "uuid_product")
    private Product product;

    @Id
    private Date date;
    private Number quantity;

    public Sales() {
    }
}