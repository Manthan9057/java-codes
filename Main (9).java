import java.util.*;
class Main {
    int equ(int arr[],int n) {
        int i,j;
        int leftsum,rightsum;
        for(i=0;i<n;i++) {
            leftsum = 0;
            
            for(j=0;j<i;j++)
            leftsum += arr[j];
            
             rightsum = 0;
             for(j=i+1;j<n;j++)
             rightsum += arr[j];
             
             if(leftsum == rightsum)
             return i;
        }
        return -1;
    }
     public static void main (String[] args) {
        Main  equi = new Main ();
        int arr[] = {1,5,6,8,6,2,4};
        int arr_size = arr.length;
 
        // Function call
        System.out.println(equi.equ(arr, arr_size));
    }
}