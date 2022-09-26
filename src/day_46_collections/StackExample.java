package day_46_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack=new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.peek());
        stack.pop();

        System.out.println("at the top now"+stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop()+" was removed from the stack");
        System.out.println(stack);
        System.out.println(stack.get(0));
        stack.add("h");
        System.out.println(stack);
    }
}
