package actitime;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int m,n,sum=0;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		while(m>0) {
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println("sum of digits: "+sum);

	}

}
