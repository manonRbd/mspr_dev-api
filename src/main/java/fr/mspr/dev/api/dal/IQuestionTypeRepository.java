package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Dmo;
import fr.mspr.dev.api.domain.QuestionType;
import org.springframework.data.repository.CrudRepository;

public interface IQuestionTypeRepository extends CrudRepository<QuestionType, String> {
}
