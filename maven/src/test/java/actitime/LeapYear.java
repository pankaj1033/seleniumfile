package actitime;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("enter years");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y%400==0||y%4==0&&y%100!=0) {
			System.out.println("leapYear");
		}
		else {
			System.out.println("not leapYear");
		}

	}

}
