package fr.mspr.dev.api;

import fr.mspr.dev.api.dal.IDmoRepository;
import fr.mspr.dev.api.domain.Dmo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class DmoRepositoryTest {

    @Autowired
    private IDmoRepository dmoRepository;

    @Test
    public void findOne() {
        String uuid = "16c890ce-c723-47b6-8090-1c7b65815a7a";
        Dmo dmo = dmoRepository.findById(uuid).get();
        Assert.assertEquals(dmo.getUuid(), uuid);
    }

    @Test
    public void findAll() {
        List<Dmo> dmoes = (List<Dmo>) dmoRepository.findAll();
        Assert.assertEquals(dmoes.size(), 2);
    }

    @Test
    public void findByLoginAndPassword() {
        Dmo dmo = dmoRepository.findByLoginAndPassword("john", "96d9632f363564cc3032521409cf22a852f2032eec099ed5967c0d000cec607a");
        Assert.assertEquals(dmo.getUuid(), "16c890ce-c723-47b6-8090-1c7b65815a7a");
    }

    @Test
    public void create() {
        Dmo dmo = new Dmo();
        dmo.setFirstname("Test user");
        dmo.setLastname("Test user");
        dmo.setLogin("login");
        dmo.setPassword("password");

        dmoRepository.save(dmo);
    }

    @Test
    public void update() {
        Dmo dmo = new Dmo();
        dmo.setUuid("16c890ce-c723-47b6-8090-1c7b65815a7a");
        dmo.setFirstname("Edited");
        dmo.setLastname("Doe");
        dmo.setLogin("john");
        dmo.setPassword("96d9632f363564cc3032521409cf22a852f2032eec099ed5967c0d000cec607a");

        dmoRepository.save(dmo);
    }

    @Test
    public void delete() {
        Dmo dmo = new Dmo();
        dmo.setUuid("ff1ce275-7dfe-11e9-9107-fa163e859eff");

        dmoRepository.delete(dmo);
    }
}