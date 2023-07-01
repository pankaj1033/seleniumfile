package actitime;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		//System.out.println("enter any number");
		//Scanner sc=new Scanner(System.in) ;
		//n=sc.nextInt();
		int n=153,temp,r,sum=0;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
            if(sum==temp) {
            	System.out.println("armstrongNumber");
            }
            else {
            	System.out.println("not armstrongNumber");
            }
	}

}
