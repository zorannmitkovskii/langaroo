package zm.language.langaroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zm.language.langaroo.model.Verb;
import zm.language.langaroo.service.VerbService;

import java.util.List;

@RestController
@RequestMapping("/api/verbs")
public class VerbController {

    @Autowired
    private VerbService verbService;

    @PostMapping
    public Verb addVerb(@RequestBody Verb verb) {
        return verbService.addVerb(verb);
    }

    @GetMapping
    public List<Verb> getAllVerbs() {
        return verbService.getAllVerbs();
    }

    @GetMapping("/{id}")
    public Verb getVerbById(@PathVariable Long id) {
        return verbService.getVerbById(id);
    }
}
