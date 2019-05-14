package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Dmo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IDmoRepository extends CrudRepository<Dmo, String> {

    public Boolean findByLoginAndPassword(@Param("email") String email, @Param("password") String password);
}
