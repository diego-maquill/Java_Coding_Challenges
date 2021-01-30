package QVI_11_Print_Sorted_Strings;

/* 
The following code prints all strings of length k where the characters are in sorted order. It
does this by generating all strings of length k and then checking if each is sorted. What is its
runtime?
*/

public class Question {

	public static int numChars = 26;

	public static void printSortedStrings(int remaining) {
		printSortedStrings(remaining, "");
	}

	public static void printSortedStrings(int remaining, String prefix) {
		if (remaining == 0) {
			if (isInOrder(prefix)) {
				System.out.println(prefix);
			}
		} else {
			for (int i = 0; i < numChars; i++) {
				char c = ithLetter(i);
				printSortedStrings(remaining - 1, prefix + c);
			}
		}
	}

	public static boolean isInOrder(String s) {
		// boolean isInOrder = true;
		for (int i = 1; i < s.length(); i++) {
			int prev = ithLetter(s.charAt(i - 1));
			int curr = ithLetter(s.charAt(i));
			if (prev > curr) {
				// isInOrder = false;
				return false;
			}
		}
		return true;
	}

	public static char ithLetter(int i) {
		return (char) (((int) 'a') + i);
	}

	public static void main(String[] args) {
		printSortedStrings(1);
	}

}
