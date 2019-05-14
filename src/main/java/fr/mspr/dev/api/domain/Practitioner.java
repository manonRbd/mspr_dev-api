package fr.mspr.dev.api.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "practitioner")
public class Practitioner implements Serializable {

    @Id
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

    @OneToMany(mappedBy = "practitioner", cascade = CascadeType.ALL)
    private Set<Sales> purchasedProducts;

    public Practitioner() {
    }
}
