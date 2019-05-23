package fr.mspr.dev.api.controller;

import fr.mspr.dev.api.dal.IAnswerRepository;
import fr.mspr.dev.api.domain.Answer;
import fr.mspr.dev.api.domain.AnswerCount;
import org.hibernate.criterion.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AnswerController {

    @Autowired
    private IAnswerRepository answerRepository;

    @PersistenceContext
    EntityManager entityManager;

    @GetMapping("/answers/search/countResponseByQuestionUuidOrderByCount")
    public List<AnswerCount> getAllPosts(@Param("question_uuid") String question_uuid) {
        List<AnswerCount> preparedResults = new ArrayList<>();

        Query query = entityManager.createQuery("SELECT a.response as response, COUNT(a) as total FROM Answer a WHERE a.question.uuid=:question_uuid GROUP BY a.response ORDER BY total DESC");
        query.setParameter("question_uuid", question_uuid);
        List<Object[]> results = query.getResultList();

        for (Object[] result : results) {
            AnswerCount answerCount = new AnswerCount((String) result[0], ((Number) result[1]).intValue());
            preparedResults.add(answerCount);
        }

        return preparedResults;
    }

}