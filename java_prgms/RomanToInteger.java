import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        int result = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equal to " + result);
    }
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        for (int i = s.length()-1;i>=0;i--) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
    public static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; 
        }
    }
}
