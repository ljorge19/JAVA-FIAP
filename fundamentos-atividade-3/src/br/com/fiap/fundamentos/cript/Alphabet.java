package br.com.fiap.fundamentos.cript;

import java.util.HashMap;
import java.util.Map;
public class Alphabet  {
	private final Map<Character,Character> alphabet;
	public Alphabet() {
		alphabet = new HashMap<Character,Character>();
		alphabet.put('a', 'p');
		alphabet.put('b', 'x');
		alphabet.put('c', 'v');
		alphabet.put('d', 'r');
		alphabet.put('e', 'b');
		alphabet.put('f', 't');
		alphabet.put('g', 'y');
		alphabet.put('h', 'j');
		alphabet.put('i', 'm');
		alphabet.put('j', 'z');
		alphabet.put('k', 'c');
		alphabet.put('l', 'i');
		alphabet.put('m', 's');
		alphabet.put('n', 'w');
		alphabet.put('o', ' ');
		alphabet.put('p', 'l');
		alphabet.put('q', 'a');
		alphabet.put('r', 'f');
		alphabet.put('s', 'u');
		alphabet.put('t', 'd');
		alphabet.put('u', 'n');
		alphabet.put('v', 'h');
		alphabet.put('w', 'o');
		alphabet.put('x', 'g');
		alphabet.put('y', 'q');
		alphabet.put('z', 'e');
		alphabet.put(' ', 'k');
	}
	@Override
	public String toString() {
		return "Alphabet";
	}
	public Map<Character, Character> getAlphabet() {
		return alphabet;
	}
}
