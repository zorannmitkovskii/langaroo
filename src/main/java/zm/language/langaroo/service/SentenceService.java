package zm.language.langaroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zm.language.langaroo.model.Sentence;
import zm.language.langaroo.repository.SentenceRepository;

import java.util.List;

@Service
public class SentenceService {

    @Autowired
    private SentenceRepository sentenceRepository;

    public Sentence addSentence(Sentence sentence) {
        return sentenceRepository.save(sentence);
    }

    public List<Sentence> getAllSentences() {
        return sentenceRepository.findAll();
    }

    public Sentence getSentenceById(Long id) {
        return sentenceRepository.findById(id).orElse(null);
    }
}
