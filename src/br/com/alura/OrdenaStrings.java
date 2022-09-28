package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("madonna");
		palavras.add("pop");
		palavras.add("brilha uma estrela");
		palavras.add("hunters");

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);

//		for (String p : palavras) {
//			System.out.println(p);
//		}

		palavras.forEach(System.out::println);

		
	}
}
