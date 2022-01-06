package _22y._01m._06d_35;
//Třída TreeMap se používá tehdy, potřebujeme-li mít klíče v mapě seřazené. Seřazení
//klíčů je nezbytné, kdy potřebujeme z mapy získat:
// - největší, či nejmenší klíč,
// - "podmapu" v závislosti na hodnotě klíče.

// Object firstKey() - vrací nejmenší klíč (první v pořadí)
// Object lastKey() - vrací největší klíč (poslední v pořadí)
// přirozený způsob řazení:
// Třída musí implementovat rozhraní Comparable
// absolutní způsob řazení:
// Rozhoduje použitý komparátor, metodou Comparator comparator() se dá zjistit,
// jaký komparátor je aktuálně použit. Voláním konstruktoru
// TreeMap(Comparator<? super K> c) komparátor pro absolutní řazení nastavíme

//Další metody ve třídě TreeMap:
// SortedMap<K,V> headMap(K doKlice) - vrací podmapu, pro kterou platí, že klíče jsou
// ostře menší než daný klíč.
// SortedMap<K,V> tailMap(K odKliceVcetne) - vrací podmapu, pro kterou platí, že klíče jsou
// větší, nebo rovny danému klíči.
// SortedMap<K,V> subMap(K odKliceVcetne, K doKlice) - umožňuje získat podmapu
// "z prostředka" stávající mapy.

class VahaKlic implements Comparable<VahaKlic> {
    double vaha;
    VahaKlic(double vaha) {
        this.vaha = vaha;
    }

}
public class ClassTreeMapUvod {
}
