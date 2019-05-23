package fr.mspr.dev.api.dal;

import fr.mspr.dev.api.domain.Dmo;
import fr.mspr.dev.api.domain.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface IQuestionRepository extends CrudRepository<Question, String> {
    public Question findByFormUuidAndPosition(@Param("form_uuid") String form_uuid, @Param("position") Integer position);
    public Iterable<Question> findAllByFormUuidOrderByPositionAsc(@Param("form_uuid") String form_uuid);
    public Integer countAllByFormUuid(@Param("form_uuid") String form_uuid);
}
