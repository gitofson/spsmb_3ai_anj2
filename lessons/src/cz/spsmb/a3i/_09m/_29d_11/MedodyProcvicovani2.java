package cz.spsmb.a3i._09m._29d_11;

public class MedodyProcvicovani2 {
    //Napište rekurzivní statickou metodu double mocnina(double x, int n),
    //která vypočítá x^n pomocí vztahu x^n=x*x^(n-1)
    private static double mocnina(final double x, final int n){
        if(n==1) {
            return x;
        } else {
            return x * mocnina(x,n-1);
        }
    }
    public static void main(String[] args){
        System.out.print(mocnina(10,3));
    }

}
