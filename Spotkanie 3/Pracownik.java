/**
 * Created by andrew on 24/10/2016.
 */
public class Pracownik {

  private String imie;
  private String nazwisko;
  private int wysokoscPensji;

  public Pracownik(String imie, String nazwisko, int wysokoscPensji) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wysokoscPensji = wysokoscPensji;
  }

  public Pracownik(String nazwisko, String imie) {
    this.nazwisko = nazwisko;
    this.imie = imie;
  }

  public String getImie() {
    return imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public int getWysokoscPensji() {
    return wysokoscPensji;
  }

  public void setWysokoscPensji(int wysokoscPensji) {
    this.wysokoscPensji = wysokoscPensji;
  }

  public void dajPodwyzke(int podwyzka) {
    wysokoscPensji += podwyzka;
  }

  public void przedstawSię() {
    System.out.println("Nazywam sie " + imie + " " + nazwisko + " zarabiam " + wysokoscPensji);
  }
}
