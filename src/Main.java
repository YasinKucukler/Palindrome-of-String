import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Palindromu alınacak kelimeyi giriniz :");
		String word  = input.nextLine();
		word = word.trim();
		if(isPalindrome(word))
		{
			System.out.println(word + " kelimesi bir palindromdur.");
		}else {
			System.out.println(word + " kelimesi palindrom değildir.");
		}
	}
	public static boolean isPalindrome(String word){
		
		char[] palindrome = new char[word.length()];
		for (int i = word.length() - 1, k = 0; i >= 0; k++, i--)
		{
			char c = word.charAt(k);
			palindrome[i] = c;
		}
		String str = new String(palindrome);
		System.out.println(str);
		return word.equals(str);
	}
}