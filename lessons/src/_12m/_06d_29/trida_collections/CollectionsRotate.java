package _12m._06d_29.trida_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRotate {
    public static void main(String[] args) {
        String[] vse = {"1", "2", "3", "1", "2", "3" };
        List<String> list = Arrays.asList(vse);
        System.out.format("Puvodni:            %s%n", list);
        Collections.rotate(list, 1);
        System.out.format("Po rotaci doprava:  %s%n", list);
        Collections.rotate(list, -1);
        System.out.format("Po rotaci doleva:   %s%n", list);
        Collections.rotate(list, 4);
        System.out.format("Po rotaci doprava:  %s%n", list);
    }
}
