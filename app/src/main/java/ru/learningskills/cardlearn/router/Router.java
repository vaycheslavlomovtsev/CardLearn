package ru.learningskills.cardlearn.router;

import ru.learningskills.cardlearn.dataclass.Language;

/**
 * Created by nikitalevchenko on 18.12.2017.
 */

public interface Router {
    void goToLanguages();
    void goToCards(Language language);
}
