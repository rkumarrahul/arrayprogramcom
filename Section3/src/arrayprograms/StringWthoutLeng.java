package arrayprograms;

public class StringWthoutLeng {
	public static void main(String[] args) {
		String s="Mahabharat";
		char[] ch=s.toCharArray();
		int count=0;
		for(char c :ch)
		{
			count++;
		}
		System.out.println(count);
	}
	
}
