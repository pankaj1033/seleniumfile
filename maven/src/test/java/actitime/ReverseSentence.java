package actitime;



public class ReverseSentence {

	

	public static void main(String[] args) {
		
		String s="pankaj kumar";
		String rev = "";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
			
		}
           System.out.println(rev);
	}

	}
