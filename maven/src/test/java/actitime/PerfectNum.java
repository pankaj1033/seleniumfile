package actitime;

public class PerfectNum {

	public static void main(String[] args) {
		int n=28,sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
            if(n==sum) {
            	System.out.println("perfectNumber");
            }
            else {
            	System.out.println("not perfectNumber");
            }
	}

}
