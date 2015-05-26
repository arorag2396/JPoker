package com.ai.jpoker;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		for (int r = 1; r <= 13; r++) {
			for (int s = 1; s <= 4; s++) {
				cards.add(new Card(s, r));
			}
		}
		Collections.shuffle(cards);
	}
}