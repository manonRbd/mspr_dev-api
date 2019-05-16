package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sale")
public class Sale implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private String uuid;

    @ManyToOne
    @JoinColumn(name = "uuid_practitioner")
    private Practitioner practitioner;

    @ManyToOne
    @JoinColumn(name = "uuid_product")
    private Product product;

    private Date date;
    private Number quantity;

    public Sale() {
    }



    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setPractitioner(Practitioner practitioner) {
        this.practitioner = practitioner;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }
}

