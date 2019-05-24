package fr.mspr.dev.api;

import fr.mspr.dev.api.dal.IPractitionerRepository;
import fr.mspr.dev.api.domain.Practitioner;
import fr.mspr.dev.api.domain.PractitionerType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class PractitionerRepositoryTest {

    @Autowired
    private IPractitionerRepository practitionerRepository;

    @Test
    public void findOne() {
        String uuid = "4dc8c578-7df8-11e9-9107-fa163e859eff";
        Practitioner practitioner = practitionerRepository.findById(uuid).get();
        Assert.assertEquals(practitioner.getUuid(), uuid);
    }

    @Test
    public void findAll() {
        List<Practitioner> practitioneres = (List<Practitioner>) practitionerRepository.findAll();
        Assert.assertEquals(practitioneres.size(), 2);
    }

    @Test
    public void create() {
        Practitioner practitioner = new Practitioner();
        practitioner.setFirstname("New firstname");
        practitioner.setLastname("New lastname");
        practitioner.setAddress("New adresse");
        practitioner.setCity("New city");
        practitioner.setPostcode("12345");
        practitioner.setCompanyName("New companyName");
        practitioner.setLatitude(1F);
        practitioner.setLongitude(1F);
        practitioner.setPractitionerType(PractitionerType.SPECIALISTE);

        practitionerRepository.save(practitioner);
    }

    @Test
    public void update() {
        Practitioner practitioner = new Practitioner();
        practitioner.setUuid("4dc8c578-7df8-11e9-9107-fa163e859eff");
        practitioner.setFirstname("Edited firstname");
        practitioner.setLastname("Edited lastname");
        practitioner.setAddress("Edited adresse");
        practitioner.setCity("Edited city");
        practitioner.setPostcode("54321");
        practitioner.setCompanyName("Edited companyName");
        practitioner.setLatitude(0F);
        practitioner.setLongitude(0F);
        practitioner.setPractitionerType(PractitionerType.GENERALISTE);

        practitionerRepository.save(practitioner);
    }

    @Test
    public void delete() {
        Practitioner practitioner = new Practitioner();
        practitioner.setUuid("7995f69e-7e00-11e9-9107-fa163e859eff");

        practitionerRepository.delete(practitioner);
    }
}