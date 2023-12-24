package Practice;
import java.util.Scanner;
public class Print_ListOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number,as far ,you want print even no");
        int number=sc.nextInt();
        System.out.println("List Of Even No From 1 to"+" "+number);
        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
    }
}
