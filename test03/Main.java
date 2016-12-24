package test03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] rs = { "unreadable", "barely readable, occasional words distinguishable",
				"readable with considerable difficulty", "readable with practically no difficulty",
				"perfectly readable" };
		String[] ss = { "Faint signals, barely perceptible", "Very weak signals", "Weak signals", "Fair signals",
				"Fairly good signals", "Good signals", "Moderately strong signals", "Strong signals",
				"Extremely strong signals" };
		Scanner scanner = new Scanner(System.in);
		int signal = scanner.nextInt();
		int r = signal / 10;
		int s = signal % 10;
		System.out.println(ss[s-1] + ", " + rs[r-1]+".");

	}

}
