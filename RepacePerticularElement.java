
public class RepacePerticularElement {

	public static void main(String[] args) {
		
		int x[]= {1,2,4,6,8,12,76,23,64};
		
		//value which we want to replace..
		int val=76;
		System.out.print("Initially array element is :");
		for(int i=0;i<x.length;i++)
		{
		 System.out.print(x[i]+" \t");
		}
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==val)
			{
				x[i]=0;
				
			}
		}
		System.out.println();
		System.out.print("Finally array element is :");
		for(int i=0;i<x.length;i++)
		{
		 System.out.print(x[i]+"\t");
		}
	}

}
