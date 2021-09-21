
public class Duplicate {

	public static void main(String[] args) {
		
		int x[]= {2,3,5,5,2,7};
		
		for(int i=0;i<x.length;i++)
		{
			int num=x[i];
			for(int j=i+1;j<x.length;j++)
			{
				if(x[j]==num)
				{
					System.out.println(x[j]+"is duplicated");
					
				}
				
			}
			
		}
		

	}

}
