import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsumoDoCombustivel {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int distancia = Integer.parseInt(br.readLine());

		double litros = Double.parseDouble(br.readLine());
		double km = distancia / litros;

		System.out.printf("%.3f km/l", km);

	}
}
