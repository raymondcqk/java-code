package test10;

import java.util.Scanner;

public class Main {

	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String input = in.nextLine();
		String[] strs = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<strs.length;i++){
			if(i!=strs.length-1){
				System.out.print(strs[i].length()+" ");
			}else{
				System.out.print(strs[i].length()-1);
			}
		}
	}

}
