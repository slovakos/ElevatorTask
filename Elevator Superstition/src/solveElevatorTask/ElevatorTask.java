package solveElevatorTask;

public class ElevatorTask {
	final static int NUMBER = 13159119;

	public static void main(String[] args) {
		System.out.println(findNumber(NUMBER));

	}

	private static int findNumber(int number) {
		int numberFloor = 0;
		for (int i = 1; i <= number; i++) {
			numberFloor++;
			while (checkNumber(numberFloor)) {
				numberFloor++;
			}

		}
		return numberFloor;

	}

	private static boolean checkNumber(int numberFloor) {

		return Integer.toString(numberFloor).contains("13") || Integer.toString(numberFloor).contains("4");
	}
}
