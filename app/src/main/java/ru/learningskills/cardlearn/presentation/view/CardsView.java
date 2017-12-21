package ru.learningskills.cardlearn.presentation.view;

import com.arellomobile.mvp.MvpView;

import java.util.List;

import ru.learningskills.cardlearn.dataclass.Card;

/**
 * Created by nikitalevchenko on 18.12.2017.
 */

public interface CardsView extends MvpView {
    void setCards(List<Card> cards);
}
