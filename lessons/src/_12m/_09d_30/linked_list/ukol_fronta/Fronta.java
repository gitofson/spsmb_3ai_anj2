package _12m._09d_30.linked_list.ukol_fronta;

import java.util.LinkedList;

//Domácí úkol do 16.12.:
//použijte LinkedList pro implementaci abstraktního datového typu fronta
//tj. totéž, co bylo uděláno v třídách Zasobnik a PouzitiZasobniku analogicky
//pro frontu
public class Fronta <E> {
    private LinkedList<E> stack = new LinkedList<E>();
    public void add (E elem){
        stack.addLast(elem);
    }
    public E remove() {
        return stack.removeFirst();
    }
    public E get() {
        return stack.getFirst();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
