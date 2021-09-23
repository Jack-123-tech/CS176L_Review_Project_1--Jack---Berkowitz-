
public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double C;
double F;
 for(int i=0; i<=212; i= i+2) {
	 C= (i - 32) / 1.8 ;
	 F= C * 1.8 + 32 ;
	 
	 System.out.println("Fahrenheit                      Celsius");
	 System.out.println(F+"                "+C);
 }

  for(int i=0; i<=212; i=i+2) {
	  C= (i - 32) / 1.8 ;
		 F= C * 1.8 + 32 ;
		 
		 System.out.println("Celsius                     Fahrenheit");
		 System.out.println(C+"                "+F);
  }
 
 

	}

}
