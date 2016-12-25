package test12;
/**
 * 要从最小的质数除起，一直除到结果为质数为止
 * 
 * 分解质因数的算式叫短除法，和除法的性质差不多，还可以用来求多个个数的公因式
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        long m=n;
        int flag = 0;
        ArrayList<String> str = new ArrayList<>();
        //
        for (long i = 2; i <= n; i++) {
            if (n % i == 0) {
                str.add(flag, Long.toString(i));
                flag++;
                n = n / i;
                i--;
            }
        }
        if (flag < 2)
            System.out.println(m);
        else {
            System.out.print(m + "=" + str.get(0));
            for (int k = 1; k < flag; k++) {
                System.out.print("x" + str.get(k));
            }
           
        }
        sc.close();

	}

}
