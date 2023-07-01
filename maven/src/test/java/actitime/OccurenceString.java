package actitime;

public class OccurenceString {

	public static void main(String[] args) {
		String s="'pankajKumar";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(j<i&&ch[i]==ch[j]) {
					break;
					
				}
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch[i]+" is "+count);
			}
		}
	}

}
