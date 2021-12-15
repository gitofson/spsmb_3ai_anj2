package _12m._09d_30.linked_list.ukol_fronta;

import java.util.LinkedList;

//Domácí úkol do 16.12.:
//použijte LinkedList pro implementaci abstraktního datového typu fronta
//tj. totéž, co bylo uděláno v třídách Zasobnik a PouzitiZasobniku analogicky
//pro frontu
    public class Fronta<E> {
        private LinkedList<E> fronta = new LinkedList<E>();

        public void add(E data) {
            fronta.addLast(data);
        }

        public E remove() {
            return fronta.removeFirst();
        }
        public E get() {
            return fronta.getFirst();
        }
        public boolean isEmpty() {
            return fronta.isEmpty();
        }
    }