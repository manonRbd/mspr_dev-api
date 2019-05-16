package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;

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
    private Float quantity;

    public Sale() {
    }

    public String getUuid() {
        return uuid;
    }

    public Practitioner getPractitioner() {
        return practitioner;
    }

    public Product getProduct() {
        return product;
    }

    public Date getDate() {
        return date;
    }

    public Float getQuantity() {
        return quantity;
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

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

