package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Sales;
import org.springframework.data.repository.CrudRepository;

public interface ISellRepository extends CrudRepository<Sales, String> {
}
