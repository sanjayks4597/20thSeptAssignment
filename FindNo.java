import java.util.Arrays;

public class FindNo {
 public static void main(String args[]) {
	 int x[] = {24,25,35,25,25,478,65,98,54,25};
	 boolean flag=false;
	 int y=65;
	 for(int i=0;i<x.length;i++)
	 {
		 if(x[i]==y)
		 {
			 
			 flag=true;
			 System.out.println("value is present in the array :and index no is :"+i);
		 }
		 
		
	 }
	 
	 
 }
}
