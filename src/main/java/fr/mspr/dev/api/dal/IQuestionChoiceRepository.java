package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Dmo;
import fr.mspr.dev.api.domain.QuestionChoice;
import org.springframework.data.repository.CrudRepository;

public interface IQuestionChoiceRepository extends CrudRepository<QuestionChoice, String> {
}
