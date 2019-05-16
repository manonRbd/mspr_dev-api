package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.PractitionerType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface IPractitionerTypeRepository extends CrudRepository<PractitionerType, String> {

}
