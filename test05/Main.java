package test05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int odd = 0, even = 0, result = 0, currentIndex = 1,current = 0;
		int num = scanner.nextInt();

		do {
			current = num % 10;
			if ((current % 2 != 0 && currentIndex % 2 != 0) || (current % 2 == 0 && currentIndex % 2 == 0)) {
				result += Math.pow(2, currentIndex - 1) ;
			}
			currentIndex++;
			num = num / 10;
		} while (num > 0);
		System.out.println(result);
	}

}
