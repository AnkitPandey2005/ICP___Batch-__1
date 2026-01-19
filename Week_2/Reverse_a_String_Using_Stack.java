package Week_2;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_a_String_Using_Stack {
    static void main() {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            st.push(ch);
        }

        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }
}
