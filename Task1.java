package SeleniumBasics;

public class Task1 {
	public static void main(String args[]) {		
		String s = "Mon";
		int k = 500;
		System.out.println(solution("Days are:" + s, k));
	}
	public static String solution(String S, int K) {
		String [] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		int index = -1;
		for (int i = 0; i < days.length; i++) {
			if (S.equals(days[i])) {
				index = i;
			}
		}
		int kIndex = (index + K) % 7;
		return days[kIndex];
    }
}
