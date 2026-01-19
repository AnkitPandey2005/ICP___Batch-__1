package Week_2;
import java.util.*;

import java.util.Scanner;
class Stack {
    int[] arr;
    int top;
    int capacity;

    //create constructor
    public Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    public void push(int x) {
        if(top==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=x;
    }

    public int pop() {
        if(top==-1){
            System.out.println("Underflow condition");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if(top==-1){
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
}

public class Stack_Implementation {
    public static void main() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Stack st=new Stack(n);
        st.push(4);
        st.push(5);
        st.push(2);
        st.push(25);
        System.out.print("Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
