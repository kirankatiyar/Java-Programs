//Write a binary search algorithm , to find an element in a sorted array;
package Assignment1;
import java.util.Scanner;
public class BinarySearchByIteratively {
    public static int find_Element(int[] a,int key,int n){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            //If the element is present at the middle index
            if(a[mid]==key){
                return mid;}
            //If the element is grater than middle index,that means element is present on the right side of the mid value.
            else if(key>a[mid]){
                low=mid+1;}
            //If the element is smaller than middle index,that means element is present on the left side of the mid value.
            else{
                high=mid-1;}
        }
        return -1;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arry = new int[size];
        System.out.println("Enter the array elements in assending order::");
        for(int i=0; i<size; i++) {
            arry[i] = sc.nextInt();
        }
        System.out.println("enter that key,which you want find in array");
        int key = sc.nextInt();
        int result = find_Element(arry,key,size);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index:"+result);
        }
    }
}
