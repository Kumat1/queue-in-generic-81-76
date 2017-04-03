import java.lang.reflect.Array;

/**
 * Queue Program using Generic Concept
 * Virliansi - 151402076
 */

public class Queue<T> {
    public Integer pointer;
    private Integer sizeArray;
    private T[] element;

    public Queue(Class<?> namaClass, Integer size) {
        pointer = -1;
        sizeArray = size;
        element = (T[]) Array.newInstance(namaClass, size);
    }

    public static void main(String[] args)
    {
        Integer pil;
        Queue <String> queue = new Queue<>(String.class, 10);

        queue.enqueue("Praktikum");
        queue.enqueue("Pemrograman");
        queue.enqueue("Java");

        System.out.println("Dequeue pertama:");
        queue.dequeue();
        System.out.println("  ");
        System.out.println("Dequeue kedua:");
        queue.dequeue();
    }

    public void enqueue(T data)
    {
        pointer++;
        element[pointer] = data;
    }

    public void dequeue()
    {
        System.out.print(element[0]);
        for (Integer i = 0; i <= pointer; i++) {
            element[i] = element[i + 1];
        }
        pointer--;

    }
}
