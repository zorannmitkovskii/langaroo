package zm.language.langaroo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Verb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @OneToMany(mappedBy = "verb", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<VerbTense> verbTenses;
}
