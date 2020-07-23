package Lambda;
import java.util.*;
import java.util.stream.Collectors;
public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings : :");
		int n = sc.nextInt();
		ArrayList<String> array = new ArrayList<>();
		System.out.println("Enter Strings:");
		sc.nextLine();
		for(int i = 0;i < n;i++){ 
			String s = sc.nextLine();
			array.add(s);
		}
		
		System.out.println("The Palindromic Strings are:");
		ArrayList<String> palindromes = IsPalindrome(array);
		System.out.println(palindromes);
	}
	public static String reverse(String s){
		String rev = "";
		int i;
		int n = s.length();
		for(i = 0; i < n; i++) {
			rev += s.charAt(n-i-1); 
		}
		return rev;
	}
	public static ArrayList<String> IsPalindrome(ArrayList<String> res){
		ArrayList<String> ar = (ArrayList<String>) res.stream().filter(s -> s.equals(reverse(s))).collect(Collectors.toList());
		return ar;
	}

}