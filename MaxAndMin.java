
public class MaxAndMin {

	public static void main(String[] args) {
		
		int x[]={18,6,31,7,9,12,78,34,11,13,44};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		System.out.println("max is "+max);
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
			
			
		}
		System.out.print("max is "+min);
		


	}

}
