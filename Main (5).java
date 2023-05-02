import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        int i,fact=1;
        int num = 8;
        for(i=1;i<=num;i++) {
            fact = i*fact;
        }
        System.out.println("fact " + num + " is " + fact);
    }
}