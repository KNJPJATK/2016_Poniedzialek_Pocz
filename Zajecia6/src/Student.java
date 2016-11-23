
public class Student extends Osoba {

	private int nrIndeksu;
	
	@Override
	public void przedstawSie() {
		System.out.println("Nazywam sie " + getImie() + " " 
				+ getNazwisko() + " i mam " + getWiek() + " " + nrIndeksu);
	}
}
