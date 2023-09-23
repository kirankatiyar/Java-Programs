//write a program to find duplicate elements in an array of integers;
//input:(1,2,3,1,4,2)
//output:(1,2)
package Assignment1;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class FindDuplicateElements {
    public static void duplicateElements(int[] a ,int n){
        HashMap<Integer,Integer> hmp = new HashMap<>();
        for(int element : a){
            Integer count = hmp.get(element);
            if(count==null){
                hmp.put(element,1);
            }
            else{
                count=count+1;
                hmp.put(element,count);
            }
        }
        System.out.print("duplicate elements are:");
        Set<Map.Entry<Integer,Integer>> hst = hmp.entrySet();
        for(Map.Entry<Integer,Integer> mp: hst)
        {
           if(mp.getValue()>1){
               System.out.print(mp.getKey()+" ");
           }
        }
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
        duplicateElements(arr,size);
    }
}