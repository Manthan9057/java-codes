import java.util.*;
class Main {
    public static void main(String args[]) {
        int sum = 38;
        int arr[] = {1,2,3,30,4};
        int n = arr.length;
        for(int i = 0; i < n;i++) {
            int current_sum = arr[i];
             System.out.println(current_sum);
            if (current_sum == sum) {
            System.out.println("sum is index" + i);
            return;
            }
            else {
                for (int j = i+1;j<n;j++) {
                    current_sum += arr[j];
                    System.out.println(current_sum);
                    if(current_sum == sum) {
                        System.out.println("sum of is index " +
                        i + " to " + j);
                        return;
                    }
                    
                }
            }
            System.out.println("no value present");
        }
        
    }
}