package fr.mspr.dev.api.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "practitioner")
public class Practitioner implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private String uuid;
    private String firstname;
    private String lastname;
    private String companyName;
    private String address;

    @Length(min = 5, max = 5)
    private String postcode;
    private String city;
    private Float latitude;
    private Float longitude;

    @ManyToOne
    @JoinColumn(name = "uuid_practitionerType")
    private PractitionerType practitionerType;

    @OneToMany(mappedBy = "practitioner", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Sale> sales;

    public Practitioner() {
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public void setPractitionerType(PractitionerType practitionerType) {
        this.practitionerType = practitionerType;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public String getUuid() {
        return uuid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public PractitionerType getPractitionerType() {
        return practitionerType;
    }

    public List<Sale> getSales() {
        return sales;
    }
}
