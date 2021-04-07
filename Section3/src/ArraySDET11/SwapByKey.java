
package ArraySDET11;

public class SwapByKey {
	public static void main(String[] args) {
		int ary[]= {10,20,30,40,50};
		int key=2;
		for(int i=0; i<key; i++)
		{
			for(int j=0; j<ary.length-1; j++)
			{
				int temp=ary[j];
				ary[j]=ary[j+1];
				ary[j+1]=temp;
			}	
		}
		for(int i:ary)
		{
			System.out.print(i+" ");
		}
	}
}
