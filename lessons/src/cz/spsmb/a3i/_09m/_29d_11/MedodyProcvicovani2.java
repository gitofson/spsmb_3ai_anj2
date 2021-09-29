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
    //Napite metodu, která vypočte Eulerovo číslo e podle vzorce e=1+1/1!+1/2!+1/3!+... se zadanou přesností
    // přesnost eps např. 1*10^-7
    private static double e(float eps){
        double fakt=1;
        double clen=1;
        double e=0;
        for(int i=1; clen>eps; i++){
            clen=1/fakt;
            e+=clen;
            fakt*=i;
            //System.out.println(fakt);
            //System.out.println(clen);
        }
        return e;
    }
    public static void main(String[] args){
        //System.out.print(mocnina(10,3));
        double naseE = e(0.01f);
        System.out.format("naše e:%f, Math.E: %f, rozdíl:%f%n",naseE, Math.E, Math.E-naseE);
    }

}
