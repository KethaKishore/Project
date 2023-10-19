import java.util.Scanner;
public class Pangram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    public static boolean isPangram(String str) {
        str = str.toLowerCase(); 
        boolean[] alphabet = new boolean[26];
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                alphabet[index] = true;
            }
        }
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true; 
    }
}
