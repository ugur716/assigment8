package assigment8;

public class Q13 {

	public static void main(String[] args) {
		System.out.println(waterTax(50));
		System.out.println(waterTax(55));
		System.out.println(waterTax(101));
		System.out.println(waterTax(151));
		System.out.println(waterTax(40));
		
		

	}
	public static double waterTax(double units) {
		double bill=0;
		
		
		if(units<=50) {
			bill=units*0.60;
			
			return bill;
			}else if(units>50 && units<=100) {
				bill=units*0.90;
				
				return bill;
			}else if(units>100 && units<=150) {
             bill=(units*0.90)+50;
				
				return bill;
				}
		   bill=(units*0.90)+100;
			
			return bill;

		
	}

}
