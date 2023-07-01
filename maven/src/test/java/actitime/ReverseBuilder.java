package actitime;

public class ReverseBuilder {

	public static void main(String[] args) {
		String s="time is money";
		StringBuilder s1=new StringBuilder();
		s1.append(s);
		s1=s1.reverse();
		System.out.println(s1);

	}

}
