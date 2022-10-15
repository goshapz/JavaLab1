import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = in.nextLine();
        String reversed = reverseString(word);
        System.out.println("Reversed word: " + reversed);
        if (isPalindrome(word))
            System.out.println("This word is a palindrome.");
        else System.out.println("This word isn`t a palindrome.");
    }
    public static String reverseString(String s){
        int length = s.length();
        String r = "";
        while(length > 0){
            r = r + s.charAt(length - 1);
            length--;
        }
        return r;
    }
    public static boolean isPalindrome(String s){
        return reverseString(s).equals(s);
    }



    }
