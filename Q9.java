package assigment8;

public class Q9 {

	public static void main(String[] args) {
		System.out.println(max(1,10));
		System.out.println(max(11,5));
		System.out.println(max(8,10));
		System.out.println(max(13,10));
		
	}
	
	public static int max(int x,int max) {
		
		if(x>max) {
			
			return max;
		}else {
			
			return x;
		}
		
		
		
	}

}
