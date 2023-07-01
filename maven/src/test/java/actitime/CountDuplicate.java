package actitime;

public class CountDuplicate {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
				//String s1 = sc.nextLine();
				String s="Programming";
				char ch[]=s.toCharArray();
				boolean[] rs=new boolean[ch.length];
				
				for(int i=0;i<ch.length;i++)
				{
					if (rs[i]==false) {
						for(int j=i+1;j<ch.length;j++)
						{
							if(ch[i]==ch[j])
							{
						System.out.print(ch[i]+" ");
						rs[j]=true;
						break;
					}
				}

			}

				}
			}
		}
			
