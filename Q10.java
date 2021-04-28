package assigment8;

public class Q10 {

	public static void main(String[] args) {
		System.out.println(isEven(5));
		System.out.println(isEven(2));
		

	}public static boolean isEven(int num) {
		
		if(num%2==0) {
			
			return true;
		}else if(num==0) {
			
			System.out.println("neither odd or even");
		}
		return false;
	}

}
