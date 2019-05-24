package fr.mspr.dev.api;

import fr.mspr.dev.api.dal.IFormRepository;
import fr.mspr.dev.api.domain.Form;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class FormRepositoryTest {

    @Autowired
    private IFormRepository formRepository;

    @Test
    public void findOne() {
        String uuid = "3da4348f-7df7-11e9-9107-fa163e859eff";
        Form form = formRepository.findById(uuid).get();
        Assert.assertEquals(form.getUuid(), uuid);
    }

    @Test
    public void findAll() {
        List<Form> formes = (List<Form>) formRepository.findAll();
        Assert.assertEquals(formes.size(), 2);
    }

    @Test
    public void create() {
        Form form = new Form();
        form.setName("New name");
        form.setDescription("New description");

        formRepository.save(form);
    }

    @Test
    public void update() {
        Form form = new Form();
        form.setUuid("3da4348f-7df7-11e9-9107-fa163e859eff");
        form.setName("Edit form name");
        form.setDescription("Existing form description");

        formRepository.save(form);
    }

    @Test
    public void delete() {
        Form form = new Form();
        form.setUuid("4c060cc1-7e00-11e9-9107-fa163e859eff");

        formRepository.delete(form);
    }
}