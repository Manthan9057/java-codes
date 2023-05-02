import java.util.*;
class Main {
    public static void main (String[] args) {
    
    
    int arr[] = {4,5,4,5,4,5,1,4,4,4};
    int n =  arr.length;
    int max = 0;
    int index=0;
    for(int i=0;i<n;i++) {
        int count=0;
        for(int j=0;j<n;j++) {
            if(arr[i] == arr[j])  
                count++;
            }
            
            if(count > max) {
                max = count;
                index = i;
            }
        }
        if(max > n/2)
        System.out.println(arr[index]);
        else
        System.out.println("nothing");
    }
    
}