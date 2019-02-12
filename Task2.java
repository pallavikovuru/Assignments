package SeleniumBasics;

public class Task2 {

	public static void main(String args[]) {
		int[] a = { -3, 0, 4, 1, 98, -3, -4 };
		System.out.println(solution("count:"+ a));
	}

	public static int solution(int[] A) {
		int negativeCount = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				negativeCount++;
			} else if (A[i] == 0) {
				return 0;
			}

		}
		if (negativeCount % 2 == 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
