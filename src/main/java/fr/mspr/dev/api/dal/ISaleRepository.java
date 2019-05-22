package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface ISaleRepository extends CrudRepository<Sale, String> {
    Iterable<Sale> findAllByPractitionerUuid(@Param("uuid_practitioner") String uuid_practitioner);
    Iterable<Sale> findAllByProductUuid(@Param("uuid_product") String uuid_product);

}
