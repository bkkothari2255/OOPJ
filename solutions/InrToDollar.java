import java.util.*;
class InrToDollar
{
	public static void main(String args[])
	{		
		int rupeesConverted;
		double dollar,rs;

		// To Scan a Value
		Scanner s = new Scanner(System.in);
		System.out.print("INR TO DOLLAR\nEnter INR : ");
		r = s.nextInt();
		d =  r/ 60.0;
		System.out.println(r + " INR = "+ d +" $ \n ");

		System.out.print("DOLLAR TO INR\nEnter Dollar : ");
		d = s.nextDouble();
		rs = ( d * 60.0 );
		System.out.println(d + " $ = "+ r + " INR"); 
		}
}
