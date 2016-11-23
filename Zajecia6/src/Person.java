import interfejsy.Talkable;

public class Person implements Talkable, Comparable {

	@Override
	public void talk() {
		System.out.println("Hej, to ja! :)");
	}
	
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}

	public static void main(String[] args) {
		
		Talkable bla = new Person();
		Comparable cor = new Person();
		
		//lambda wyrazenie zamiast anonimowej klasy wewnetrznej
		Talkable student = () -> {System.out.println("NIC");};
//				new Talkable() {
//			
//			@Override
//			public void talk() {
//					System.out.println("NIC");
//			}
//		};
		
		bla.talk();
		bla.whisper();
		
		System.out.println(Talkable.shoutAll());
		
		
	}
}
