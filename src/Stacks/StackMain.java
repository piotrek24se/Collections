package Stacks;

public class StackMain {

//    public static void main(String[] args) {
//
//        Stack stack = new ArrayStack();
//
//        System.out.println("Add 15 to stack");
//        stack.push(15);
//
//        System.out.println("Add 2 to stack");
//        stack.push(2);
//
//        System.out.println("Add 17 to stack");
//        stack.push(17);
//
//        System.out.println("Poll from stack: " + stack.poll());
//
//        System.out.println("Pop from stack: " + stack.pop());
//        System.out.println("Pop from stack: " + stack.pop());
//        System.out.println("Pop from stack: " + stack.pop());
//        System.out.println("Pop from stack: " + stack.pop()); // return default value (max int)
//
//        System.out.println("Is empty stack: " + stack.isEmpty());
//
//    }

    public static void main(String[] args) {
        Stack stack = new ArrayStack();

        for (int i = 0; i < 17; i++) {
            System.out.println("Add " + i + " to stack");
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.println("Stack value: " + stack.pop());
        }
    }

}
