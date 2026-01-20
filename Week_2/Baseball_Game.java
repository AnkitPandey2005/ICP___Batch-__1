package Week_2;
import java.util.*;

public class Baseball_Game {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String[] ops = new String[n];
        for (int i = 0; i < n; i++) {
            ops[i] = in.next();
        }
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] operations){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("D") && !st.isEmpty()){
                st.push(st.peek()*2);
            }
            else if(s.equals("C") && !st.isEmpty()){
                st.pop();
            }
            else if(s.equals("+") && !st.isEmpty()){
                int a=st.pop();
                int b=st.pop();
                int result=a+b;
                st.push(b);
                st.push(a);
                st.push(result);
            }
            else{
                int a=Integer.parseInt(s);
                st.push(a);
            }
        }
        int total=0;
        for(int val:st){
            total+=val;
        }
        return total;
    }
}
