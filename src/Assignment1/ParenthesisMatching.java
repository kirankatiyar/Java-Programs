//write a program to check if a given string containing parenthesis is balanced or not;
// Example: input: "{[()()]}"   output :Balanced
package Assignment1;
import java.util.Stack;
import java.util.Scanner;
public class ParenthesisMatching {
    // Function to check Parenthes is Balanced or not
    public static boolean balancedParenthesis(String str){
        // convert given String into character array by string.toCharArray() method.
        char[] chrarry = str.toCharArray();
        //create empty stack
        Stack<Character> stck = new Stack<>();
        // Loop to iterate array.
        for(int i=0;i<chrarry.length;i++) {
            char c = chrarry[i];
            if (isOpningParenthesis(c)) {
                stck.push(c);
            } else {
                if (stck.isEmpty()) {
                    return false;
                } else if (!isMatching(stck.peek(), c)) {
                    return false;
                } else {
                    stck.pop();
                }
            }
        }
        return(stck.isEmpty());
    }
    // Function to check Parenthes is opning or not
    public static boolean isOpningParenthesis(char c){
        return  c=='('||
                c=='['||
                c=='{' ;
    }
    // Function to check Parenthes is matched or not
    public static boolean isMatching(char a,char b){
        return  a=='(' && b==')' ||
                a=='[' && b==']' ||
                a=='{' && b=='}' ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your expression");
        String str = sc.nextLine();
        boolean n= balancedParenthesis(str);
        if(n==true){
            System.out.println("parenthesis is balanced ");}
        else{
            System.out.println("parenthesis is not balanced");}
    }
}
