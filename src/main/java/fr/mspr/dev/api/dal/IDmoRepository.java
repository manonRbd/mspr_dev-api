package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Dmo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface IDmoRepository extends CrudRepository<Dmo, String> {

    Dmo findByLoginAndPassword(@Param("login") String login, @Param("password") String password);
}
