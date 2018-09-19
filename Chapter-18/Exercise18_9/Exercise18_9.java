import java.util.*;

public class Exercise18_9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or words: ");
		String s = input.nextLine();
		
		reverseDisplay(s);
	}
	
	public static void reverseDisplay(String value) {
		String temp = "";
		if (value.length() == 0) {
		}
		else {
			System.out.print(value.charAt(value.length() - 1) + "");
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}