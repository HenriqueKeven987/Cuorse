package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		
		lista.remove(0);
		lista.removeIf(list -> list.charAt(0) == 'A');
		
		for (String list : lista) {
			System.out.println(list); 
		}
		
		System.out.println("-----------------------");
		System.out.println(lista.indexOf("Aster"));
		System.out.println(lista.indexOf("Jaden"));
		
		System.out.println("-----------------------");
		
		List<String> resultado = lista.stream().filter(list -> list.charAt(0) == 'J').collect(Collectors.toList());
		for (String list2 : resultado) {
			System.out.println(list2);
		}
		
		System.out.println("----------------------");
		String name = lista.stream().filter(qualquercoisa -> qualquercoisa.charAt(0) == 'x').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
