package assigment8;

public class Q4 {

	public static void main(String[] args) {
		
		printHollowRect();
		

	}public static void printHollowRect() {
		
		int raw=5;
		int column=5;
		
		for(int a=0;a<=raw;a++) {
			
			for(int b=0;b<=column;b++) {
				
				if(a==0 || a==raw|| b==0 || b==column) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
					
				}
			}
			System.out.println("");
		
			
			
			
		}
		
		
	}

}
