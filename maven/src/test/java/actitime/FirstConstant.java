package actitime;

public class FirstConstant {

	public static void main(String[] args) {
		String name="pankaj is my name";
		String [] nm=name.split(" ");
		String nstr="";
		for(int i=nm.length-1;i>=0;i--) {
			if(i==0) {
				nstr=nm[i]+nstr;
				
			}
			else if (i!=0) {
				for(int j=0;j<nm[i].length();j++) {
					nstr=nm[i].charAt(j)+nstr;
				}
				nstr=" "+nstr;
			}
		}
				System.out.println(nstr);
	}

}
