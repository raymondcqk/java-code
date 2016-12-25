package test09;
/**
 * 未完全通过测试
 */
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		int n = in.nextInt();
		int table[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j = 0;j<n;j++){
				table[i][j] = in.nextInt();
			}
		}
		//横向扫描
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j>0&&table[i][j]==table[i][j-1]){
					flag =true;
				}else{
					flag = false;
				}
			}
			if(flag == true){
				chenkWinner(table, i);
				break;
			}
		}
		if(flag == true){
			return;
		}
		//纵向
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				if(i>0&&table[i][j]==table[i-1][j]){
					flag =true;
				}else{
					flag = false;
				}
			}
			if(flag == true){
				chenkWinner(table, i);
				break;
			}
		}
		if(flag == true){
			return;
		}
		//正对角
		for(int i = 0;i<n;i++){
			if(i>0&&table[i][i]==table[i-1][i-1]){
				flag = true;
			}else{
				flag = false;
			}
			if(flag == true){
				if(table[0][0]==1){
					System.out.println("X");
				}else{
					System.out.println("O");
				}
				break;
			}
		}
		if(flag == true){
			return;
		}
		//反对角
		for(int i = n-1;i>=0;i--){
			for(int j = 0;j<n;j++){
				if(i>0&&table[i][j]==table[i+1][j-1]){
					flag = true;
				}else{
					flag = false;
				}
				if(flag == true){
					if(table[n-1][0]==1){
						System.out.println("X");
					}else{
						System.out.println("O");
					}
					break;
				}
			}
		}
		if(flag == true){
			return;
		}else{
			System.out.println("NIL");
		}
	}

	private static void chenkWinner(int[][] table, int i) {
		if(table[i][0]==1){
			System.out.println("X");
		}else{
			System.out.println("O");
		}
	}

}
