import java.io.*;
class Main {
    static void  Rotate(int arr[],int d, int n) {
        int p=1;
        while(p <= d) {
            int last = arr[0];
            for(int i= 0; i<n-1;i++) {
                arr[i] = arr[i+1];
                
            }
            arr[n-1] = last;
            p++;
        }
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = { 7,5,8,7,8,9,5,4,1,2,3};
        int n = arr.length;
        int d = 3;
        Rotate(arr,d,n);
    }
}