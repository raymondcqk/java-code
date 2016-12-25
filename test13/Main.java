package test13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>  factors = new ArrayList<>();
		int sum = 0;
		boolean isFirst = true;
		for(int i = n;i<=m;i++){
			for(int j = 1;j<i;j++){
				if(i%j==0){
					factors.add(j);
				}
			}
			for (Integer f : factors) {
				sum +=f;
			}
			if(sum == i){
				if(isFirst){
					System.out.print(i);
					isFirst = false;
				}else{
					System.out.print(" "+i);
				}
			}
		factors.clear();
		sum = 0;
		}
	}

}
