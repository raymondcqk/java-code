package test14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();

	}

}

class Fraction {
	public int den;
	public int mol;

	public Fraction() {
		this.den = 0;
		this.mol = 0;
	}

	public Fraction(int mol, int den) {
		this.den = den;
		this.mol = mol;
	}

	public double toDouble() {
		return ((double) mol) / den;
	}

	public Fraction plus(Fraction r) {
		Fraction newF = new Fraction();
		if (this.den == r.den) {
			newF.mol = this.mol + r.mol;
			newF.den = this.den;

		} else if (this.den % r.den == 0 || r.den % this.den == 0) {
			if (this.den > r.den) {
				newF.mol = r.mol*this.den / r.den + this.mol;
				newF.den = this.den;
			} else {
				newF.mol = r.mol*r.den / this.den + this.mol;
				newF.den = r.den;
			}
		} else {
			newF.den = minCommonMultiple(r.den, this.den);
			newF.mol = this.mol*newF.den / this.den + r.mol*newF.den / r.den;
		}
		return newF;
	}

	public Fraction multiply(Fraction r) {
		Fraction f = new Fraction();
		f.mol = this.mol * r.mol;
		f.den = this.den * r.den;
		int maxcom = maxCommonDivisor(f.mol, f.den);
		if(maxcom!=1){
			f.mol /= maxcom;
			f.den /= maxcom;
		}
		return f;
	}
	public void print() {
		if (this.mol == this.den) {
			System.out.println("1");
		} else {
			int maxcom = maxCommonDivisor(this.mol,this.den);
			if(maxcom != 1){
				this.mol /= maxcom;
				this.den /= maxcom;
			}
			System.out.println(this.mol + "/" + this.den);

		}
	}
	private int minCommonMultiple(int a, int b) {
		int i;
		for (i = a;; i += a) { // 填空
			if (i % b == 0)
				return i;
		}
	}
	 // 递归法求最大公约数 
	private int maxCommonDivisor(int m, int n) {  
        if (m < n) {// 保证m>n,若m<n,则进行数据交换  
            int temp = m;  
            m = n;  
            n = temp;  
        }  
        if (m % n == 0) {// 若余数为0,返回最大公约数  
            return n;  
        } else { // 否则,进行递归,把n赋给m,把余数赋给n  
            return maxCommonDivisor(n, m % n);  
        }  
    } 
}
