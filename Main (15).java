
// arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
// Output: 3 4 5 6 7 1 2



import java.util.*;
class Main {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;
        for(int i = d;i<n;i++) {
            System.out.println(arr[i]);
        }
        for(int i=0;i<d;i++) {
            System.out.println(arr[i]);
        }
    }
}