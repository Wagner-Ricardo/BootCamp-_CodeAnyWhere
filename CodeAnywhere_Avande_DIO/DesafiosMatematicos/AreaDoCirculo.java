
import java.util.Locale;
import java.util.Scanner;

public class AreaDocirculo {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));
		Scanner scan =  new Scanner(System.in);
		double raio =  scan.nextDouble();
		double area ;
		double PI = 3.14159;
		area = PI *(Math.pow(raio, 2));
		
		System.out.printf("A=%.4f\n", area);

	}

}
