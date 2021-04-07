package ArraySDET11;

public class SumationOf2DifferentArray {
	public static void main(String[] args) {
		int arr[]= {3,5,7,9};
		int arr1[]= {4,6,8};
		int sum[]=new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			sum[i]=arr[i]+arr1[i];
			
		}
		
		for(int i:sum)
		{
			System.out.print(i+ " ");
		}
	}
}

class Array1
{
	public static void main(String[] args) {
		int a[]= {3,5,7,8};
		int b[]= {4,6,8};
		
		int count=a.length;
		if(count<b.length)
		{
			count=b.length;
		}
		int[] c=new int [count];
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				c[i]=a[i]+b[i];
				System.out.print(c[i]+" ");
			}
		}
		else if(a.length>b.length)
		{
			for(int i=0; i<b.length; i++)
			{
				c[i]=a[i]+b[i];
				System.out.print(c[i]+" ");
			}
			for(int i=b.length; i<a.length; i++)
			{
				c[i]=a[i];
				System.out.print(c[i]+" ");
				
			}
		}
				
	}
}
class Array2
{
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,2,3,8};
		int count=a.length;
		if(b.length>count)
		{
			count=b.length;
		}
		int c[]=new int[count];
		for(int i=0; i<count; i++)
		{
			try 
			{
				c[i]=a[i]+b[i];
			}
			catch(Exception e)
			{
				try 
				{
					c[i]=a[i];
				}
				catch(Exception f)
				{
					c[i]=b[i];
				}
			}
			System.out.print(c[i]+" ");
			
		}
	}
}