package zm.language.langaroo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import zm.language.langaroo.model.Sentence;
import zm.language.langaroo.model.Verb;

public interface SentenceRepository extends JpaRepository<Sentence, Long> {
}
