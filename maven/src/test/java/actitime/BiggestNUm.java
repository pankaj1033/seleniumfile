package actitime;

import java.util.Scanner;

public class BiggestNUm {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int big=x;
		if(y<big)
		{
			big=y;
			if(z<big)
			{
			big=z;
			}
		}
		
			System.out.println("biggest is: "+big);
	}

}