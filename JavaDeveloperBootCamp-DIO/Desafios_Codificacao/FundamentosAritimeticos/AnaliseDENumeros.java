import java.util.Scanner;

public class AnaliseDENumeros {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		int quantidNumerosDigitados = 5;
		int valorPos = 0;
		int valorNeg = 0;
		int valorPar = 0;
		int valorInp = 0;

		for(int i=1; i <= quantidNumerosDigitados; i++) {

			int valorDigitado = scan.nextInt();

			if(valorDigitado > 0) {
				valorPos ++;
			}else if(valorDigitado < 0) {
				valorNeg ++;
			}
			
			 int valorOperacao =  valorDigitado %2;
			 if(valorOperacao == 0) {
				  valorPar ++;
			 }else {
				 valorInp ++;
			 }

		}
		
		System.out.println(valorPar + " valor(es) par(es)");
		System.out.println(valorInp + " valor(es) impar(es)");
		System.out.println(valorPos + " valor(es) positivo(s)");
		System.out.println(valorNeg + " valor(es) negativo(s)");

		scan.close();

	}

}



