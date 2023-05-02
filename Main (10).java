import java.util.Scanner;
import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word: ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        String rev = "";
        for(int i=str.length() - 1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
     System.out.println(rev);
        
    }
}