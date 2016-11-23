package interfejsy;

public interface Talkable {

	int a = 3;

	void talk();

	static int shoutAll() {
		return 4;
	}

	//metoda domyslna - moze miec cialo
	default void whisper() {
		System.out.println("shhhh");
	}

}
