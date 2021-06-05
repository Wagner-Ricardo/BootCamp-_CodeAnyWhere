import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Locale;


public class FolhaDePagamento {
  public static void main(String[] args) throws IOException {
    Locale.setDefault(new Locale("en", "US"));
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numero = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int hora = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    double valorHora = Double.parseDouble(st.nextToken());

    double salary = hora * valorHora; // Altere o valor da variável com o cálculo esperado
    System.out.println("NUMBER = " + numero);
    System.out.printf("SALARY = U$ %.2f", salary);
  }
}