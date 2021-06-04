import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

/*
 * Construi uma lista de compra que ordene o itens em ordem alfabetica sem que haja produtos repetidos
 * Como entrada  será dada a quantidade de lista de compras. Cada lista de compras pode conter de 1 a 1000 itens de produtos
 * Os nomes dos produtos poderam ter de 1 a 20 palavras todas em minusculas  e separadas por um espaço.
 * 
 * Livro de referencia como programar java pagina 564
 * 
 * array e lisArray pagina 189, collectons 637
 */

public class ListaDeComprasSugestao {

	public static void main(String[] args) throws  IOException {
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int N = Integer.parseInt(st.nextToken());
		    ArrayList<String> arrayItems = new ArrayList<>(N);
		    String currentItem;
		    ArrayList<String> testCaseArray = new ArrayList<>();

		    for(int i = 0; i < N; i++){
		      st = new StringTokenizer(br.readLine());
		      
		      while(st.hasMoreTokens()){
		        currentItem = st.nextToken();

		        if(testCaseArray.isEmpty() || !testCaseArray.contains(currentItem)){
		            testCaseArray.add(currentItem);
		          }
		      }  
		      
		      Collections.sort(testCaseArray);
		      StringBuilder testCaseNoDuplicates = new StringBuilder();

		      for(String item : testCaseArray){
		          testCaseNoDuplicates.append(item + " ");
		      }

		      arrayItems.add(testCaseNoDuplicates.toString());
		      testCaseArray = new ArrayList<>();
		    }

		    
		    for(String item : arrayItems){
		      System.out.println(item);
		    }
	
		
	}

}