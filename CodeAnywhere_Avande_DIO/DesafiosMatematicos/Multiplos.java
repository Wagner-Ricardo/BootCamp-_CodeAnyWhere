import java.io.IOException;
import java.util.Scanner;

public class Multiplos{
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int P  = leitor.nextInt();
        int Q  = leitor.nextInt();

        if ( Q%P == 0 || P%Q == 0 ) {
            System.out.println("Sao Multiplos");

        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
    
}