package test02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		if (time < 0 || time > 2359) {

			return;
		}
		int ge = time % 10;
		int shi = (time - ge) / 10 % 10;
		int bai = (time - shi * 10 - ge) / 100 % 10;
		int qian = (time - bai * 100 - shi * 10 - ge) / 1000 % 10;
		if (shi > 5) {
			return;
		}
		int bjtHour = time / 100;
		int min = time % 100;
		int utcHour = 0;
		if (bjtHour >= 8) {
			utcHour = bjtHour - 8;
		} else {
			utcHour = 24 + bjtHour - 8;
		}
		int utcTime = utcHour * 100 + min;

		System.out.println(utcTime);

	}

}
