public class Reverser {

	public String Reverse(String wordToReverse){
		var reversedWord = "";
		for (int i=wordToReverse.length() - 1; i>-1; i--){
			reversedWord = reversedWord + wordToReverse.charAt(i);
		}
		System.out.println("Reversed Word is: " + reversedWord);
		return reversedWord;
	}

	public boolean Palindrome(String palindrome){
		String reversed = Reverse(palindrome);
		reversed = reversed.toLowerCase();
		palindrome = palindrome.toLowerCase();

		if (reversed.equals(palindrome)){
			System.out.println(" It is a Palindrome" + reversed + " " + palindrome );
			return true;
		}else {
			System.out.println(" It is not a Palindrome " + reversed + " " + palindrome);
			return false;

		}
	}

}