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
    @JoinColumn(name = "uuid_practitioner", nullable = false, updatable=false, insertable = false)
    private Practitioner practitioner;

    @Column(nullable = false)
    private String uuid_practitioner;

    @ManyToOne
    @JoinColumn(name = "uuid_product", nullable = false, updatable=false, insertable = false)
    private Product product;

    @Column(nullable = false)
    private String uuid_product;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Float quantity;

    public Sale() {
    }

    public String getUuid_practitioner() {
        return uuid_practitioner;
    }

    public void setUuid_practitioner(String uuid_practitioner) {
        this.uuid_practitioner = uuid_practitioner;
    }

    public String getUuid_product() {
        return uuid_product;
    }

    public void setUuid_product(String uuid_product) {
        this.uuid_product = uuid_product;
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

