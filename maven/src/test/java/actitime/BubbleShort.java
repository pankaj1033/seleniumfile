package actitime;

public class BubbleShort {

	public static void main(String[] args) {
		int temp;
		int a[]= {8,11,6,55,32,11,87};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]+ "");
		}

	}

}
