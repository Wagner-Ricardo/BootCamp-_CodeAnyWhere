import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumerosPares {

	public static void main(String[] args) throws IOException  {
		int contaPar=0;
		int[] valoresPares =  new int[80];	
		int valorOperacao ;
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int valorEntrada =  Integer.parseInt(st.nextToken());

		 while(valorEntrada > 0 ) {
			 valorOperacao = valorEntrada%2;
			 
			 if(valorOperacao == 0) {
				valoresPares[contaPar] = valorEntrada;
				 contaPar ++;
			 }
			
			 valorEntrada--;

		 }

		 for (int i = contaPar-1; i >=0 ; i--) {
		   int valorSaida = valoresPares[i];
			 System.out.println(valorSaida);
		 }
		}
	}


