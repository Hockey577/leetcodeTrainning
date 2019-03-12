package jianZhiOffer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class test5 {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        while (!stack2 .empty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public static int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }
}
