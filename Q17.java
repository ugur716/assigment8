package assigment8;

public class Q17 {

	public static void main(String[] args) {
		System.out.println(getThunderBlazz(true, false, 1, 2, 3));
		System.out.println(getThunderBlazz(false, false, 1, 2, 3));
		System.out.println(getThunderBlazz(false, false, 1, 5, 3));
		System.out.println(getThunderBlazz(false, false, 3, 1, 2));
	

	}public static boolean getThunderBlazz(boolean avilable, boolean gift, int ingredient1, int ingredient2,
		int ingredient3) {
		boolean flag = false;

		if (avilable || gift) {
			flag = true;
		} else if (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) {
			flag = true;
		} else if (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2) {
			flag = true;
		}
		return flag;
	}

}
