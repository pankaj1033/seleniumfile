package actitime;

public class ReverseWord {

	public static void main(String[] args) {
		String s="my name is pankaj";
		String ch[]=s.split("");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]+" ");
		}

	}

}
