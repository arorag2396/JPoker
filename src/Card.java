public class Card {
	private final SUIT suit;
	private final VALUE value;

	public Card(int suit, int value) {
		if (suit <= 0 || suit > 5) {
			throw new IllegalArgumentException("Illegal suit specified");
		}

		if (value <= 0 || value > 13) {
			throw new IllegalArgumentException("Illegal value specified");
		}

		this.suit = SUIT.fromInt(suit);
		this.value = VALUE.fromInt(value);
	}


	public final SUIT getSuit() {
		return suit;
	}

	public final VALUE getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.format("Card{value=%s, suit=%s}", value.toString(), suit.toString());
	}

	public static void main(String []args) {
		Card c = new Card(1, 1); // Ace of spades
		System.out.println(c);
	}

	public enum VALUE {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
		EIGHT, NINE, JACK, QUEEN, KING;

		private static final VALUE[] values = values();

		public static VALUE fromInt(int v) {
			return values[v - 1];
		}

		public static int toInt(VALUE v) {
			return v.ordinal() + 1;
		}
	}

	public enum SUIT {
		SPADE, HEART,
		DIAMOND, CLUB,
		JOKER;

		private static final SUIT[] values = values();

		public static SUIT fromInt(int v) {
			return values[v - 1];
		}

		public static int toInt(SUIT s) {
			return s.ordinal() + 1;
		}
	}
}