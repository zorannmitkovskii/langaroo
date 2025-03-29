package zm.language.langaroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zm.language.langaroo.model.Sentence;
import zm.language.langaroo.model.Verb;
import zm.language.langaroo.service.SentenceService;
import zm.language.langaroo.service.VerbService;

import java.util.List;

@RestController
@RequestMapping("/api/sentence")
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

//    @PostMapping
//    public Sentence addSentence(@RequestBody Sentence sentence) {
//        return sentenceService.addSentence(sentence);
//    }
//
//    @GetMapping
//    public List<Sentence> getAllSentences() {
//        return sentenceService.getAllSentences();
//    }
//
//    @GetMapping("/{id}")
//    public Sentence getSentenceById(@PathVariable Long id) {
//        return sentenceService.getSentenceById(id);
//    }
}