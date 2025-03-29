package zm.language.langaroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zm.language.langaroo.model.VerbTense;
import zm.language.langaroo.service.VerbTenseService;

import java.util.List;

@RestController
@RequestMapping("/api/verb-tense")
public class VerbTenseController {

    @Autowired
    private VerbTenseService verbTenseService;

    @PostMapping
    public VerbTense addVerbTense(@RequestBody VerbTense verbTense) {
        return verbTenseService.addVerbTense(verbTense);
    }

    @GetMapping
    public List<VerbTense> getAllVerbTenses() {
        return verbTenseService.getAllVerbTenses();
    }

    @GetMapping("/{id}")
    public VerbTense getVerbTenseById(@PathVariable Long id) {
        return verbTenseService.getVerbTenseById(id);
    }
}
