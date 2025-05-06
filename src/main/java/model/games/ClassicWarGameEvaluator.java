package model.games;

import allShared.ICardsCollection;
import allShared.IGameEvaluator;
import model.cards.Card;


/**
 * Cet évaluateur s'appuie sur la comparaison "naturelle" des cartes
 * i.e. la méthode compareTo() définie dans classe Card qui compare
 * les valeurs des cartes
 * 
 * @author francoise.perrin
 */
public class ClassicWarGameEvaluator extends AbstractGameEvaluator implements IGameEvaluator {

	@Override
	protected final Card max(ICardsCollection gamingMat) {
		return gamingMat.max();
	}

	@Override
	protected final int comparaison(Card card, Card maxCard) {
		return card.compareTo(maxCard);
	}
}
