package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.PractitionerType;
import org.springframework.data.repository.CrudRepository;

public interface IPractitionerTypeRepository extends CrudRepository<PractitionerType, String> {

}
