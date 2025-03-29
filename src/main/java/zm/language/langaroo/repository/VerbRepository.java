package zm.language.langaroo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import zm.language.langaroo.model.Verb;

public interface VerbRepository extends JpaRepository<Verb, Long> {
}
