package actitime;

public class StringArrangeWord {

	public static void main(String[] args) {
		String s="a1b2c3";
		String a="";
		String b="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&& ch[i]<='z') {
				a=a+ch[i];
				
			}
			else {
				b=b+ch[i];
			}
		}
            System.out.println(a+b);
	}

}
