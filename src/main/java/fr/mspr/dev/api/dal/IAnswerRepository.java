package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface IAnswerRepository extends CrudRepository<Answer, String> {
    Iterable<Answer> findAllByPractitionerUuid(@Param("uuid_practitioner") String uuid_practitioner);
    Iterable<Answer> findAllByQuestionUuid(@Param("uuid_question") String uuid_question);
    Iterable<Answer> findOneByPractitionerUuidAndQuestionUuid(@Param("uuid_practitioner") String uuid_practitioner, @Param("uuid_question") String uuid_question);

}
