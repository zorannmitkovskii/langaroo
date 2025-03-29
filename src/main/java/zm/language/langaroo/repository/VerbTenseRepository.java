package zm.language.langaroo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import zm.language.langaroo.model.Verb;
import zm.language.langaroo.model.VerbTense;

public interface VerbTenseRepository extends JpaRepository<VerbTense, Long> {
}
