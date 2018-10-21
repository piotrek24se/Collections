package Stacks;

public interface Stack <T> {

    // Add element to stack
    void push (T element);

    // Get and delete from stack
    T pop ();

    // Get withot delete from stack
    T poll ();

    // Is empty collection - true if no elements on stack
    boolean isEmpty ();
}
