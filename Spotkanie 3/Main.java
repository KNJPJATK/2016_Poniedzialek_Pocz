import java.util.Arrays;

public class Main {


  public static void main(String[] args) {
    //  SPLIT
    String s = "What the hell";
    String[] splitString = s.split("e");
    // wzgledem czego chcemy dzielic^
    System.out.println(Arrays.toString(splitString));

    String s1 = "ALAXXXMAXXXKOTA";
    String[] xy = s1.split("XXX");
    System.out.println(Arrays.toString(xy));

    //           0123456
    String s2 = "XXXALA MA KOTA";
    String substring1 = s2.substring(3);
    System.out.println(substring1);

    String substring2 = s2.substring(3, 6);
    System.out.println(substring2);

    String s3 = "ala ma kota";
    String s4 = s3.toUpperCase();
    System.out.println(s4);

    //  toLowerCase
    System.out.println(s3.endsWith("kota"));
    System.out.println(s3.startsWith("ala"));

    for (int i = 0; i < s3.length(); i++) {
      System.out.print(s3.charAt(i));
    }

    //  Tyle o Stringach !

    String test1 = "ALAxxxMAxxxKOTA";
    String testNewString = new String("test");
    String test2 = "AsiaOOOBasiaOOOKasia";
    String test3 = "Hax111Pax111Max";

    String[] test1Split = test1.split("xxx");
    for (int i = 0; i < test1Split.length; i++) {
      test1Split[i] = test1Split[i].toUpperCase();
    }

    String[] pocietyTest1 = przetworzStringi(test1, "xxx");
    System.out.println();
    System.out.println(Arrays.toString(pocietyTest1));

    String[] pocietyTest2 = przetworzStringi(test2, "OOO");
    String[] pocietyTest3 = przetworzStringi(test3, "111");

    System.out.println(Arrays.toString(pocietyTest2));
    System.out.println(Arrays.toString(pocietyTest3));
    //  zesplitowac
    //  to co mamy zesplitowane zrobic upper case
    //  wyprintowac

    //  silnia 6
    //  6!

    int silnia6 = 1 * 2 * 3 * 4 * 5 * 6;
    System.out.println(silnia6);
    int wynikSilni = silnia(6);
    System.out.println(wynikSilni);


    int fib6 = fib(6);
    System.out.println(fib6);






    Pracownik kowalski = new Pracownik("Jan", "Kowalski", 4000);
    kowalski.przedstawSię();
    kowalski.dajPodwyzke(500);
    kowalski.przedstawSię();

    Pracownik nowak = new Pracownik("Adam", "Nowak");
    nowak.setWysokoscPensji(1500);
  }



  public static int fib(int n){
    if (n <= 1)
      return 1;
    else
      return fib(n-1) + fib(n-2);
  }


  public static int silnia(int n){
    if (n == 1){
      return 1;
    } else {
      return n * silnia(n-1);
      //  6 * 5
      //  5 * 4
      //  4 * 3
      //  3 * 2
      //  2 * 1

    }
  }


  public static String[] przetworzStringi(String doPociecia, String wycinany){
    String[] wynikCiecia = doPociecia.split(wycinany);
    for (int i = 0; i < wynikCiecia.length; i++) {
      wynikCiecia[i] = wynikCiecia[i].toUpperCase();
    }
    return wynikCiecia;
  }

}
