import java.io.IOException;
import java.util.Scanner;

public class QuantidadeNumerosPositivos {

	public static void main(String[] args) throws IOException {
		Scanner scan =  new Scanner(System.in);
		int quantidNumerosDigitados = 7;
		int valorPos = 0;
		
		for(int i=1; i < quantidNumerosDigitados; i++) {
			
			double valorDigitado = scan.nextDouble();

			if(valorDigitado > 0) {
				valorPos ++;
			}
			 
		}
