package Week_2;

import java.util.*;

public class Backspace_String_Compare {
    static void main() {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String t=in.next();
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t){
        Stack<Character> st=new Stack<>();
        Stack<Character> ts=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(s.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!ts.isEmpty()){
                    ts.pop();
                }
            }else{
                ts.push(t.charAt(i));
            }
        }
        if(st.equals(ts)){
            return true;
        }
        return false;
    }
}
