package ArraySDET11;

public class ParticularCharCapital {
	public static void main(String[] args) {
		String s="Indiaindia";
		
	//	s=s.replace('i', 'I');
		//System.out.println(s);
		
		//2nd Apprach
		String m="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='i')
			{
				char c=s.charAt(i);
				m=m+(c+"").toUpperCase();
			}
			else
			{
				m=m+s.charAt(i);
			}
		}
		System.out.println(m);
	}
}
