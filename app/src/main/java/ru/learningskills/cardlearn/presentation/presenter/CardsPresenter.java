package ru.learningskills.cardlearn.presentation.presenter;

import android.os.Bundle;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.List;

import ru.learningskills.cardlearn.data.db.DBRepository;
import ru.learningskills.cardlearn.dataclass.Card;
import ru.learningskills.cardlearn.presentation.view.CardsView;
import ru.learningskills.cardlearn.presentation.view.adapter.CardsAdapter;

/**
 * Created by nikitalevchenko on 18.12.2017.
 */

@InjectViewState
public class CardsPresenter extends MvpPresenter<CardsView> {

    public static final String LANGUAGE_KEY = "LANGUAGE_KEY" ;
    private List<Card> cards;

    public void onResume() {
        cards = DBRepository.INSTANCE.getCards();
        getViewState().setCards(cards);
    }

    public CardsAdapter.Listener getCardsListener() {
        return new CardsAdapter.Listener() {

            @Override
            public void onCardClick(Card card) {

            }
        };
    }


    public void onCreate(Bundle arguments) {
    }
}
