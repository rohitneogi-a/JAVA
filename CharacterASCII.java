import java.util.Scanner;

public class CharacterASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = scanner.next().charAt(0);
        
        int asciiValue = (int) c;
        System.out.println("ASCII value of '" + c + "': " + asciiValue);
    }
}
