package zm.language.langaroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zm.language.langaroo.model.Verb;
import zm.language.langaroo.repository.VerbRepository;

import java.util.List;

@Service
public class VerbService {

    @Autowired
    private VerbRepository verbRepository;

    public Verb addVerb(Verb verb) {
        return verbRepository.save(verb);
    }

    public List<Verb> getAllVerbs() {
        return verbRepository.findAll();
    }

    public Verb getVerbById(Long id) {
        return verbRepository.findById(id).orElse(null);
    }
}
