package ArraySDET11;

public class reverse {
	public static void main(String[] args) {
		String s="India";
		s=s.toLowerCase();
		String s1="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			String ch=s.charAt(i)+"";
			s1=s1+ch;
		//	s1=s1+s.charAt(i);   
		}
		System.out.println(s1);
		
		System.out.println("-------------------------------------");
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\n---------------------------------------------");
		//by to char array method
		char ch[]=s.toCharArray();
		String rev="";
		for(int i=0; i<ch.length; i++)
		{
			
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		
		String s3="";
		//System.out.print(s.compareTo(s3));
		System.out.print(s3.compareTo(s));
		
		String s5="india";
		String s6="india";
		System.out.println("\n"+s5.compareTo(s6));
		
	}

}
