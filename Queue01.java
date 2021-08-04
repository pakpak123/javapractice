/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class Queue01 {

    private int[] elements = new int[8];
    private int size;

    public Queue01() {
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int v) {

        if (size >= elements.length) {
            int[] copy = new int[elements.length * 2];

            System.arraycopy(elements, 0, copy, 0, elements.length);
            elements = copy;
        }
        elements[size++] = v;

    }

    public int getqueue(int size) {

        return elements[size];
    }

    public int dequeue() {

        int[] copy = new int[elements.length - 1];
        int queue = elements[0];
        System.arraycopy(elements, 1, copy, 0, elements.length - 1);
        elements = copy;
        size--;
        return queue;
    }

}
