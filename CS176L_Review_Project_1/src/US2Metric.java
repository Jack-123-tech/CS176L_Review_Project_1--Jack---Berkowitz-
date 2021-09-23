
public class US2Metric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		double lb;
		int i;
		double cm ;
		// Print a Table of Inch Centimeter
		i =1 ;
		System.out.println(" inches       centimeters        pounds        kilograms");
		System.out.println("");
		System.out.println("------       -----------        ------        ---------");
		while (i<=50)
		{
	    lb=i*0.45359237;
		cm = i*2.54 ;
		
		System.out.printf(" %d               %.2f             %d           %.2f \n ", i,cm ,i, lb );
		i++;
	
		
		
		
		}
		
	

		
		
		
	}

}
