import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrdenandoNumerosParesImpares {

	public static void main(String[] args) throws  IOException {

	
		int proxPos= 0;
		int contPar = 0;
		int contImpar = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tamanho = Integer.parseInt(br.readLine());

		int[] vetorEntrada = new int [tamanho];
		int[] vetorSaida = new int [vetorEntrada.length];

		if((tamanho > 0) && (tamanho < 10000)) {

			for( int i = 0; i < tamanho; i++) {
				vetorEntrada[i] = Integer.parseInt(br.readLine());

			}

			for (int k = 0; k < vetorEntrada.length; k++) {

				if(vetorEntrada[k] %2 == 0) {
					vetorSaida[proxPos] = vetorEntrada[k];
					proxPos++;
					contPar++;
				}

			}

			for ( int l = vetorEntrada.length-1; l >= 0; l--) {

				if(vetorEntrada[l] %2 != 0) {
					vetorSaida[proxPos] = vetorEntrada[l];
					proxPos++;
					contImpar++;
				}
			}
		}

	

		for (int m = 0; m < contPar ; m++) {

			for(int n = (vetorEntrada.length - contImpar -1) ; n > m;  n--) {

				if(vetorSaida[n] < vetorSaida[n-1]) {
					int troca = vetorSaida[n];
					vetorSaida[n] =  vetorSaida[n-1];
					vetorSaida[n-1] = troca;
				}
			}

		}

		//realizando a ordenanção impares
		for (int n = 0; n < contImpar; n++) {

			for( int m = vetorEntrada.length-1; m > contPar; m--) {

				if(vetorSaida[m] > vetorSaida[m-1]) {
					int troca = vetorSaida[m];
					vetorSaida[m] =  vetorSaida[m-1];
					vetorSaida[m-1] = troca;
				}
			}

		}
		
		for(int k = 0; k < vetorSaida.length; k++) {
			System.out.println(vetorSaida[k]);		

		}


	}

}