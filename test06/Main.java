package test06;
/**
 * 素数和
 * 
题目内容：
我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。

输入格式:
两个整数，第一个表示n，第二个表示m。

输出格式：
一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。

输入样例：
2 4

输出样例：
15
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int index = 0,result=0;
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int m = sr.nextInt();
		for(int i=2;;i++){
			if(isPrime(i)){
				index++;
				if(index>=n){
					result += i;
				}
				if(index==m){
					break;
				}
			}
		}
		System.out.println(result);
		
	}
	
	/**
	 * 判断素数
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num){
		boolean flag = true;
		if(num<2){
			return false;
		}
		
		for(int i = 2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}

}
