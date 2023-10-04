//Implement the bubble sort algorithm to sort an array;
package Assignment1;
import java.util.Scanner;
public class BubbleSortAlgorithm {
    public static void sortArray(int[]a,int n){
        for(int i=0;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;}
                flag=1;
            }
            if(flag==0){
                break;
            }
        }
        System.out.println("\n");
        System.out.println("sorted array");
        for(int el:a){
            System.out.print(el+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arry = new int[size];
        System.out.println("Enter the array elements::");
        for(int i=0; i<size; i++) {
            arry[i] = sc.nextInt();}
        System.out.println("unsorted array::");
        for(int e:arry){
            System.out.print(e+" ");}
        sortArray(arry,size);
    }
}
