import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no of Series element you want: ");
		int n=sc.nextInt();
		
		Fibonacii.series(n);
		

	}
	public static void series(int k) {
		
		int x[]= new int[k];
		
		for(int i=0;i<k;i++)
		{
			if(i==0) {
				x[i]=i;
			}
			else if(i==1)
			{
				x[i]=i;
			}
			else {
				x[i]=x[i-1]+x[i-2];
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(x[i]+" ");
		}
	}

}
