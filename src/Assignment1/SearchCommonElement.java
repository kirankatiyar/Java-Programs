//Given two lists of integers , find and return a list containing the common elements present in both lists.
//input List1: [1,2,3,4] List2: [3,4,5,6]
//output: [3,4]
package Assignment1;
import java.util.HashSet;
import java.util.Scanner;
public class SearchCommonElement {
    public static void findCommonElement(int[] a,int[] b){
        // create hashsets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        // Adding elements from array a
        for(int i : a ){
            set1.add(i);
        }
        // Adding elements from array b
        for(int j : b ){
            set2.add(j);
        }
        // use retainAll() method to find common elements
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter the elements of list1::");
        for(int i=0; i<size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of list2::");
        for(int i=0; i<size; i++) {
            arr2[i] = sc.nextInt();
        }

        findCommonElement(arr1,arr2);
    }
}