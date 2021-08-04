/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
/*public class Queue00 {

    private int count = 8;

    private int[] elements = new int[count];
    private int size;

    public void enqueue(int v) {

        if (size == count) {
            int[] ele = new int[count * 2];
            System.arraycopy(elements, 0, ele, 0, size);
            count = count * 2;
            elements = new int[count];
            System.arraycopy(ele, 0, elements, 0, size);

        }
        elements[size] = v;
        size++;
    }

        
    public void dequeue() {
        size--;
        elements[size] = 0;
    }

     public boolean empty() {
      if(size == 0)
      {
      return true;
      }
        return false;
    }

    public int getSize() {
        return size;
    }

    public int[] getElements() {

        return elements;
    }

    String getqueue(int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}*/
