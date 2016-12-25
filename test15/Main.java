package test15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> citys = new ArrayList<>();
		String tmp = sc.next();
		while(!tmp.equals("###")){
			citys.add(tmp);
			tmp = sc.next();
		}
		int[][] distances = new int[citys.size()][citys.size()];
		for(int i=0;i<citys.size();i++){
			for(int j=0;j<citys.size();j++){
				distances[i][j] = sc.nextInt();
			}
		}
		
		String cityA = sc.next();
		String cityB = sc.next();
		System.out.println(distances[citys.indexOf(cityA)][citys.indexOf(cityB)]);
		
	}

}
