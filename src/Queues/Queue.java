package Queues;

public interface Queue<T> {

//    dodanie elementu: push(element)
//    pobranie elementu: poll()
//    sprawdzenie elementu bez pobrania: peek()
//    sprawdzenie czy kolejka jest pusta: isEmpty()

    // Dodaenie elementu
    void push(T element);

    // Pobranie wartosci i usuniecie
    T poll();

    // Pobranie bez usuniecia
    T peek();

    // Sprawdzenie czy jest pusta
    boolean isEmpty();

}
