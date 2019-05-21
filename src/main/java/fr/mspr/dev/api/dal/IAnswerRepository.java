package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Answer;
import fr.mspr.dev.api.domain.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface IAnswerRepository extends CrudRepository<Answer, String> {
    Iterable<Sale> findAllByPractitionerUuid(@Param("uuid_practitioner") String uuid_practitioner);
    Iterable<Sale> findAllByQuestionUuid(@Param("uuid_question") String uuid_question);
}
