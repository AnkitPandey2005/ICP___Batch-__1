package Week_2;

import java.util.*;

public class Valid_Paratheses {
    static void main() {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if((st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='{' && s.charAt(i)=='}') || (st.peek()=='[' && s.charAt(i)==']')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
