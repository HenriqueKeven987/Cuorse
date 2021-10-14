package Application;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Maria");
		lista.add("Alex");
		lista.add("Aster");
		lista.add("Joao");
		lista.add(3, "Jaden");
		
		System.out.println(lista.size());

		for (String list : lista) {
			System.out.println(list);
		}
		
		System.out.println("-----------------------");
		
		lista.remove(3);
		lista.removeIf(list -> list.charAt(0) == 'A');
		
		for (String list : lista) {
			System.out.println(list); 
		}

	}

}
