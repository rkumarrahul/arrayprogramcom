package ArraySDET11;

public class SplitMethod {
	
	/*reverse the sentence	`
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String s="my name is raj";
		String[] s1=s.split(" ");
		for(int i=s1.length-1; i>=0; i--)
		{
			System.out.print(s1[i]+"");
		}
		
		String rev="";
		for(int i=s1.length-1; i>=0; i--)
		{
			rev=rev+" "+s1[i]; 
		}
		System.out.print("\n"+rev.trim());
	}
}
