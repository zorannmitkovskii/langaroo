package zm.language.langaroo.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
public class Sentence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "verb_tense_id", nullable = false)
    private VerbTense verbTense;

    private String value;
}
