package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Practitioner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface IPractitionerRepository extends CrudRepository<Practitioner, String> {

}
