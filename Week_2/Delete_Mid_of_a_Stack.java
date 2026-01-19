package Week_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Delete_Mid_of_a_Stack {
    public static void deleteMid(Stack<Integer> st, int size) {
        ArrayList<Integer> v = new ArrayList<>();
        while (!st.isEmpty()) {
            v.add(st.pop());
        }
        int mid = size / 2;
        v.remove(mid);

        for (int i = v.size() - 1; i >= 0; i--) {
            st.push(v.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int size = st.size();
        deleteMid(st, size);
        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.print(p + " ");
        }
    }
}
