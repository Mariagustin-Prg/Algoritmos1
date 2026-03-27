package Cl_27_03;

import java.util.ArrayList;

public class Pila<E> {
    
   private ArrayList<E> pila;

   public Pila() {
    pila = new ArrayList<>();
   }
   
   public boolean isEmpty() {
    return pila.isEmpty();
   }

   public void push(E elemento) {
        pila.add(elemento);
   }

   public E pop() {
    if (isEmpty()) {return null;}
    return pila.removeLast();
   }

   public E peek() {
    if (isEmpty()) {return null;}
    return pila.get(pila.size() - 1);
   }

   public int size() {
    return pila.size();
   }
}