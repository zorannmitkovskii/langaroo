package zm.language.langaroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zm.language.langaroo.model.VerbTense;
import zm.language.langaroo.repository.VerbTenseRepository;

import java.util.List;

@Service
public class VerbTenseService {

    @Autowired
    private VerbTenseRepository verbTenseRepository;

    public VerbTense addVerbTense(VerbTense verbTense) {
        return verbTenseRepository.save(verbTense);
    }

    public List<VerbTense> getAllVerbTenses() {
        return verbTenseRepository.findAll();
    }

    public VerbTense getVerbTenseById(Long id) {
        return verbTenseRepository.findById(id).orElse(null);
    }
}
