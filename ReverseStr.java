package Assignments;

public class ReverseStr {
/** Test reverse string******/
	public static void main(String[] args) {
		String str = "pallavi";
		String reverse = "";
		int count = 0;
		String vowels="";
		String cons="";
		//System.out.println(str.length());
		//System.out.println(str.charAt(6));
		for (int i = str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

		}
		System.out.println(reverse);

		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
					|| str.charAt(j) == 'u') {
				count++;
				vowels= vowels+str.charAt(j)+',' ;

			}
			else {
				cons=cons+str.charAt(j)+',';
				
			}

		}
		System.out.println(count);
		System.out.println(vowels);
		System.out.println(cons);

	}
}