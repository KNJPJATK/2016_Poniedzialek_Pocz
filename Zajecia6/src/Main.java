
public class Main {

	public static void main(String[] args) {
		
		//tak nie mozemy zrobic, bo klasa jest abstrakcyjna
//		Osoba os = new Osoba();
//		Pracownik p = new Pracownik();
//		Student s = new Student();
//		
//		Osoba p1 = new Pracownik();
//		Osoba s2 = new Student();
//				
//		p1.przedstawSie();
//		s2.przedstawSie();
//		
		//klasy wewnetrzne
		A klasaA = new A();
		A.B klasaB = klasaA.new B();
		//C - statyczna
		A.C klasaC = new A.C();

		//anonimowa klasa wewnetrzna
		Osoba os = new Osoba(){
			
			@Override
			public void przedstawSie() {
				
			}
		};
	}

}
