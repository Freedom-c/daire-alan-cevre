package daireAlanCevre;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int r;
		double pi=3.14;
		double alan, cevre;
		System.out.println("Dairenin yarıçapını giriniz:");
		Scanner inp = new Scanner(System.in);
		r= inp.nextInt();
		
		alan= pi*r*r;
		cevre= 2*pi*r;
		
		System.out.println("Alan: "+ alan);
		System.out.println("Çevre: "+ cevre);
	}

}
