package com.alexkozyura.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		String message = "Hello World!";
		int i = 42;
		int j = 9;
		int answer = i * j;

		String stringAnswer;
		stringAnswer = message + " " + answer;

		float a = 3.7f, b = 4.12f;
		float floatAnsver = (float) i / (float) j * a * b;

		boolean isMoreThanOne;
		if (answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		boolean isMoreThanTwo = answer > 2 ? true : false;

		System.out
				.println(message + " " + stringAnswer + " " + floatAnsver + " " + isMoreThanOne + " " + isMoreThanTwo);
	}
}
