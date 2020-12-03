import java.util.ArrayList;
import java.util.Scanner;
public class Lab25Part1{
	
	public static ArrayList<Character> toCharacterArray(String s){
		ArrayList<Character> a = new ArrayList<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			a.add(s.charAt(i));
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String s = stdin.nextLine();
		String n = "";
		for(char a : toCharacterArray(s)) {
			n += a + " ";
		}
		System.out.println("Elements of the Character array list: " + n);
		
	}
}
