package test08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] xs = new int[2][101];
		Scanner sr = new Scanner(System.in);
		int power = 0, coefficient = 0, max = 0;
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j < 101; j++) {
				xs[i][j] = 0;
			}
		}
		for (int i = 0; i <= 1; i++) {
			do{
				
				power = sr.nextInt();
				coefficient = sr.nextInt();
				xs[i][power] += coefficient;
				if (power > max) {
					max = power;
				}
			}while(power!=0);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = max; i >= 0; i--) {
			xs[0][i] = xs[0][i] + xs[1][i];
			if (i == 1&&xs[0][i]!=0) {
				sb.append(xs[0][1] + "x" + "+");
			} else if (i == 0 ) {
				if(xs[0][0]!=0){
					sb.append(xs[0][0]);					
				}else{
					sb.deleteCharAt(sb.length()-1);
				}
			} else if (xs[0][i] != 0) {
				sb.append(xs[0][i] + "x" + i + "+");
			}
		}
		System.out.println(sb.toString());

	}
}
