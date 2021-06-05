import java.util.Scanner;
import java.util.Locale;

public class CalculoDaViagem{

	public static void main(String[] args){
	  
	  	Locale.setDefault(new Locale("en", "US"));

		Scanner scan = new Scanner(System.in);
		double tempo =  scan.nextDouble();
		double velocidade = scan.nextDouble();
	
		System.out.printf("%.3f\n", ( tempo * velocidade  )/12.0);
	}
}