
public class Pracownik extends Osoba {
	
	private int pensja;
	
	@Override
	public void przedstawSie() {
		System.out.println("Nazywam sie " + getImie() + " " 
				+ getNazwisko() + " i mam " + getWiek() + " lat i zarabiam " + pensja);
	}

}
