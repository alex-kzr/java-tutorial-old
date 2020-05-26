package com.alexkozyura.stringmanipulation;

public class StringUtil {
	public static void main(String[] args) {

		String source = "Hello my beautiful World!";

		String[] words = source.split(" ");

		System.out.println(words.length);

		for (int i = 0; i < words.length; i++) {

			System.out.println(words[i]);
			char[] letters = words[i].toCharArray();
			System.out.println(letters.length);
		}

		int i = 0;
		while (i < words.length) {
			
			System.out.println(words[i]);
			char[] letters = words[i].toCharArray();
			System.out.println(letters.length);
			i++;
		}
	}
}
