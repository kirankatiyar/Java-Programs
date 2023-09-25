//Given two lists of integers , find and return a list containing the common elements present in both lists.
//input List1: [1,2,3,4] List2: [3,4,5,6]
//output: [3,4]
package Assignment1;
import java.util.HashSet;
import java.util.Scanner;
public class SearchCommonElement {
    public static void findCommonElement(int[] a,int[] b,int n){
        HashSet<Integer> hst = new HashSet<>();
        System.out.println("common elements are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    hst.add(a[i]);
                }
            }
        }
        for(int com_num :hst){
            System.out.println(com_num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] ary = new int[size];
        System.out.println("Enter the elements of list1::");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of list2::");
        for(int i=0; i<size; i++) {
            ary[i] = sc.nextInt();
        }

        findCommonElement(arr,ary,size);
    }
}