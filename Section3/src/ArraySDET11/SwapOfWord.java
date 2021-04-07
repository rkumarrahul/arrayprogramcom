package ArraySDET11;

public class SwapOfWord {
	public static void main(String[] args) {
		String s="welcome to testYantra";
		String temp="";
		String[] ch=s.split(" ");
		temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		for(String x:ch)
		{
			System.out.print(x+" ");
		}
	}
}
