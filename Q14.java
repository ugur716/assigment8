package assigment8;

public class Q14 {

	public static void main(String[] args) {
		System.out.println(threeLocks(true,false,true));
		System.out.println(threeLocks(true,true,true));
		System.out.println(threeLocks(true,false,false));
		
		

	}
	public static boolean threeLocks(boolean a,boolean b,boolean c) {
		
		boolean result=a && b && c;
		return result;
	}

}
