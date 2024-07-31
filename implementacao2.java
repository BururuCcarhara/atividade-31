package Lore;
import java.util.ArrayList;
public class implementacao2 {

	public static void main(String[] args) {
		ArrayList<String>nomes=new ArrayList<>();
		try {
			nomes.add("Alice");
			nomes.add("Bob");
			nomes.add("Charlie");
			
			System.out.println("nome: "+nomes.get(2));
		}catch (ArithmeticException erro) {
			System.out.println("invalido");
		}
		
	}

}
