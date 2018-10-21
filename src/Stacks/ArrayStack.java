package Stacks;

import java.util.Arrays;

public class ArrayStack <T> implements Stack <T> {

//    private static final int DEFAULT_EMPTY_VALUE = Integer.MAX_VALUE;
//
//    // ver 1 - no more than 15 elements on stack
//
//    private int[] stackArrayHolder = new int[15];
//    private int currentIndex = -1;
//
//    @Override
//    public void push(int element) {
//        currentIndex++;
//        stackArrayHolder[currentIndex] = element;
//    }
//
//    @Override
//    public int pop() {
//        if (isEmpty()) {
//            return DEFAULT_EMPTY_VALUE;
//        }
//        int currentValue = stackArrayHolder[currentIndex];
//        currentIndex--;
//        return currentValue;
//    }
//
//    @Override
//    public int poll() {
//        return stackArrayHolder[currentIndex];
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return currentIndex < 0;
//    }

    // ver 2 - unlimited elements on stack (dane od Kuby wyslane na Slacku)

    private final T DEFAULT_EMPTY_VALUE = null;

    private T[] stackArrayHolder = (T[]) new Object[15];
    private int currentIndex = -1;

    @Override
    public void push(T element) {
        currentIndex++;

        if (currentIndex >= stackArrayHolder.length) {

            int newSize = stackArrayHolder.length * 2;
            //TODO check if newSize is not greater than MAX_INT

            stackArrayHolder = Arrays.copyOf(stackArrayHolder, newSize);
        }

        stackArrayHolder[currentIndex] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return DEFAULT_EMPTY_VALUE;
        }
        T currentValue = stackArrayHolder[currentIndex];
        currentIndex--;
        return currentValue;
    }

    @Override
    public T poll() {
        return stackArrayHolder[currentIndex];
    }

    @Override
    public boolean isEmpty() {
        return currentIndex < 0;
    }
}
