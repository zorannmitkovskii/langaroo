CREATE TABLE question (
                                    id SERIAL PRIMARY KEY,
                                    sentence_template TEXT NOT NULL,
                                    correct_answer TEXT NOT NULL,
                                    verb_hint TEXT,
                                    tense_hint TEXT,
                                    type VARCHAR(50) NOT NULL -- COMPLETE_SENTENCE, GUESS_VERB, GUESS_TENSE
);