package zm.language.langaroo.model;

import jakarta.persistence.*;

@Entity
public class VerbTense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "verb_id", nullable = false)
    private Verb verb;

    @Enumerated(EnumType.STRING)
    private TenseEnum tense;

    private String value;
}
