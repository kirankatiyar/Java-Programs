//Given two lists of integers , find and return a list containing the common elements present in both lists.
//input List1: [1,2,3,4] List2: [3,4,5,6]    //output: [3,4]
package Assignment1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
public class SearchCommonElement {
    public static void findCommonElement(int[] list1,int[] list2){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i:list1){
            mymap.put(i,1);
        }
        for(int j:list2){
            if(mymap.containsKey(j)){
                mymap.put(j,mymap.get(j)+1);}
        }
        System.out.print("common elements are:");
        for(Map.Entry<Integer,Integer> e: mymap.entrySet())
        {
            if(e.getValue()>1){
                System.out.print(e.getKey()+" ");}
        }
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