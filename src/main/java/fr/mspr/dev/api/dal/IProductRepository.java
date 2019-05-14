package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Dmo;
import fr.mspr.dev.api.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, String> {
}
