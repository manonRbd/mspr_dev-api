package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Dmo;
import fr.mspr.dev.api.domain.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IQuestionRepository extends CrudRepository<Question, String> {
}
