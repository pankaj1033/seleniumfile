package actitime;

public class PrimeNum {

	public static void main(String[] args) {
		int n=3,count=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count++;
				
			}
		}
		
           if(count==0) {
        	   System.out.println("primeNumber");
           }
           else {
        	   System.out.println("not primeNumber");
           }
	}

}
