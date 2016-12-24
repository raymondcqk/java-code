package test07;
/**
 * 念整数
题目内容：
你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。
如输入1234，则输出：
yi er san si

注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出的开头加上“fu”，如-2341输出为：
fu er san si yi

输入格式:
一个整数，范围是[-100000,100000]。

输出格式：
表示这个整数的每一位数字的汉语拼音，每一位数字的拼音之间以空格分隔，末尾没有空格。

输入样例：
-30

输出样例：
fu san ling
 */
import java.util.Scanner;

public class Main {
	private Main() {
	}

	public static final String[] pinyins = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", };
	public static final String fu = "fu";

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean isNegative = false;
		boolean isFist = true;
		int input = sr.nextInt();
		if(input<0){
			isNegative = true;
			input = -input;
		}
		
		do{
			if(isFist){
				sb.insert(0, pinyins[input%10]);
				isFist = false;
			}else{
				sb.insert(0, pinyins[input%10]+" ");
			}
			input /= 10;
		}while(input>0);
		if(isNegative){
			sb.insert(0, fu+" ");
			
		}
		System.out.println(sb.toString());
	}
}
