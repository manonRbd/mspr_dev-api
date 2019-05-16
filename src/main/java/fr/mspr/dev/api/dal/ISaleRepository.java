package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Sale;
import org.springframework.data.repository.CrudRepository;

public interface ISaleRepository extends CrudRepository<Sale, String> {
}
