package Week_2;

import java.util.Stack;

public class Min_Stack {
    private Stack<int[]> st;

    public Min_Stack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (st.isEmpty()) {
            st.push(new int[]{value, value});
        } else {
            int mini = Math.min(getMin(), value);
            st.push(new int[]{value, mini});
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        if (st.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return st.peek()[0];
    }

    public int getMin() {
        if (st.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return st.peek()[1];
    }
}
