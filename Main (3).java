import java.util.Scanner;
import java.util.*;
class Main {
    static void Rotate(int arr[],int d,int n) {
        int temp[] = new int[n];
        int k = 0;
        for(int i=d;i<n;i++) {
            temp[k] = arr[i];
            k++;
        }
        for(int i=0;i<d;i++) {
            temp[k] = arr[i];
            k++;
        }
        for(int i =0; i<n; i++) {
            arr[i] = temp[i];
        }
        
    }
    static void Print(int arr[],int n) {
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
 public static void main (String[] args)
    {
       int arr[] = {3,2,5,4,7,8,9,6};
       int n = arr.length;
       int d = 2;
      Rotate(arr,d,n);
      Print(arr,n);
    }
}