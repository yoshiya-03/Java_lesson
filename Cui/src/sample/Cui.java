package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cui {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Please input your name");
		String line = reader.readLine();
		System.out.println("Hello " + line + " !");
	}
}