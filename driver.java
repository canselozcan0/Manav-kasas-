import java.util.Scanner;

public class driver {
public static void main(String[] args) {
	double armut = 2.14 , elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;
	double armutk, elmak, domatesk, muzk, patlıcank;
	Scanner input = new Scanner(System.in);
	System.out.println("Armut kaç kilo ?");
	armutk = input.nextDouble();
	System.out.println("Elma kaç kilo ?");
	elmak = input.nextDouble();
	System.out.println("Domates kaç kilo ?");
	domatesk = input.nextDouble();
	System.out.println("Muz kaç kilo ?");
	muzk = input.nextDouble();
	System.out.println("Patlıcan kaç kilo ?");
	patlıcank = input.nextDouble();
	double toplam = (armut*armutk) + (elma * elmak) + (domates * domatesk) + (muz * muzk) + (patlıcan * patlıcank);
	System.out.println("Toplam Tutar : " + toplam);
	
	
}
}
