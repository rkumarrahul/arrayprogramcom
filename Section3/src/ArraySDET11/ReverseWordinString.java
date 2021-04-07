package ArraySDET11;


public class ReverseWordinString {

		public static void main(String[] args) {
			String s="welcome to tyss";
			String[] s1=s.split(" ");
			String s2="";
			for(int i=0;i<s1.length; i++)
			{
				String ch=s1[i]+"";
				for(int j=ch.length()-1; j>=0; j--)
				{
					s2=s2+ch.charAt(j);  
					
				}
				s2=s2+" ";
			}
			System.out.println(s2);
		}
}

