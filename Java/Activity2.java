package activity2;

public class Activity2 {

	public static void main(String[] args) {
		// creating a list of 6 numbers as array
		int[] array = {10, 77, 10, 54, -11, 10};
	  //Total Score	
		int total = 0;
		for (int i=0;i<array.length;i++)
		 {
		  if(array[i]==10) 
			{
			 total=total+10;	
			}
		 }
		  if (total==30)
			{
				System.out.println("True");
			}
			else 
			{
				System.out.println("False");
			}
		}

	}
