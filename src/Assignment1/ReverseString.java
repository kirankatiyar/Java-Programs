//Program 1: Reverse the given String;
//Example.....
//input: "Hello"
//output: "olleH"
package Assignment1;
import java.util.Scanner;
import java.util.Stack;
public class ReverseString {
    public String reverseString(String data){
        Stack<Character> stk = new Stack<Character>();
        char[] charry = data.toCharArray(); //convert string into character and store in character array
        for(int i=0;i<charry.length;i++){   // store character in stack
            stk.push(charry[i]);}
        for(int i=0;i<charry.length;i++){
            charry[i]=stk.pop();}
        String convertstr = String.valueOf(charry);  // convert character array into string
        return convertstr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseString obj = new ReverseString();
        System.out.println("enter String");
        String str = sc.next();
        String revstr = obj.reverseString(str);
        System.out.println("original String is "+" "+str);
        System.out.println("reverse String is "+" "+revstr);
    }
}
