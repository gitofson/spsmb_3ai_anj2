package _12m._09d_30.linked_list.ukol_fronta;


public class PouzitiFronty {
    public static void main(String[] args) {
        Fronta<String> fr = new Fronta<>();
        fr.add("prvni");
        fr.add("druhy");
        fr.add("treti");
        while(!fr.isEmpty()){
            System.out.println(fr.get());
            fr.remove();
        }
    }
}