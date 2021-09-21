
public class FindMissingNoInArray {

	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7,8,9,10,11,12,14,15};
		
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]!=x[i+1]-1)
			{
				System.out.println("Missing no is: "+(x[i]+1));
			}
			
		}

	}

}
