package com.alexkozyura.stringmanipulation;

public class StringUtil {
	public static void main(String[] args) {
		
		String source = "Hello World!";
		
		String[] words = source.split(" ");
		
		System.out.println(words.length);
		System.out.println(words[0]);
		
		char[] letters1 = words[0].toCharArray();		
		System.out.println(letters1.length);
		
		System.out.println(words[1]);
		
		char[] letters2 = words[1].toCharArray();		
		System.out.println(letters2.length);
	}
}
