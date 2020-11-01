import java.util.Scanner;
public class HW2_2 {
	public static boolean isAnagrams(String x, String y) {
		
		String first = x.replaceAll("\\s", "").toLowerCase();
		String second = y.replaceAll("\\s", "").toLowerCase();
		
		
		char[] a = first.toCharArray();
		char[] b = second.toCharArray();
		
		
		if(x.length() != y.length())
			return false;
		
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				if(a[j] > a[j+1]){
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				if(b[j] > b[j+1]){
					char temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
				
			}
		}

		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		
		
		return true;
		
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String x = stdin.nextLine();
		System.out.println("Enter the second string: ");
		String y = stdin.nextLine();
		
		System.out.println(x + " and " + y + " are" + (isAnagrams(x,y) ? "": " NOT") + " anagrams");
	}
}
