// Implement function to find the maximum and minimum element in an array.
//input: array={1,5,2,8,3,4}   output : min = 1  max = 8 ;
package Assignment1;
import java.util.Scanner;
public class MaximumAndMinimumNumber {
    public static void findMax_minNumber(int[]a,int n) {
        int max = a[0] , min = a[0] ;
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.print("maximum number is:"+" "+max);
        System.out.println(" ");
        System.out.println("minimum number is:"+" "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array ::");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        findMax_minNumber(arr,size);
    }
}
