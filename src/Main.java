import pociski.PociskPneumatyczny;
import symulacjaLotu.symulacja;

public class Main {

	public static void main(String[] args) {
		PociskPneumatyczny p1=new PociskPneumatyczny(9,20);
		symulacja s1=new symulacja(p1,45);
		s1.lot();

	}

}
