package Week_2;

import java.util.Scanner;

public class Remove_Outermost_Parentheses {
    static void main() {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(removeOuterParentheses(str));
    }
    public static String removeOuterParentheses(String s) {
        /*
        if opened==0  =>outside
        if opened==1  =>outermost
        if opened>1   =>inside
        * */
        int opened=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='(' && opened++>0){
                sb.append(c);
            }
            if(c==')' && opened-->1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
