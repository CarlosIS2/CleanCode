public class Vectores {
    private int n;                       //tamaño del vector
    private int v[] = new int[n];        //vector


    public Vectores(int[] v,int n){
       this.v = v;
       this.n = n;

    }

    public int[] getV() {
        return v;
    }

    public int tamaño(int[] v){
        return v.length;
    }  //da el tampaño del vector dado

    public int suma(){                          //Suma los elementos del vector
        int a = 0;
        for (int i = 0; i < v.length; i++) {
            a+= v[i];
        }
        return a;
    }

    public int[] suma2(int[] v, int[] v2){                          //Suma dos vectores
        if(v.length >= v2.length){
            int[] res = new int[v.length];
            for (int i = 0; i < v.length; i++) {
                res[i] = v[i] + v2[i];
            }
            return res;
        }else {
            int[] res = new int[v2.length];
            for (int i = 0; i < v2.length; i++) {
                res[i] = v[i] + v2[i];
            }
            return res;
        }
    }

    public int resta(){                          //Resta los elementos del vector
        int a = 0;
        for (int i = 0; i < v.length; i++) {
            a -= v[i];
        }
        return a;
    }

    public int[] pares() {                                  //devuelve un vector con los pares de uno dado
        int a = 0;                                        //contador pares
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                a++;
            }
        }
        int res[] = new int[a];
        for (int i = 0, f = 0; i < v.length; i++) {
            if(v[i] % 2 == 0){
                res[f] = v[i];
                f++;
            }
        }
        return res;
    }

    public int[] impares() {                                //devuelve un vector con los impares de un vector dado
        int a = 0;                                        //contador impares
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 != 0) {
                a++;
            }
        }
        int res[] = new int[a];
        for (int i = 0, f = 0; i < v.length; i++) {
            if (v[i] % 2 != 0) {
                res[f] = v[i];
                f++;
            }
        }
        return res;
    }

    public int[] multiplo(int n) {                         //devuelve un vector con los múltiplos de un entero dado
        int a = 0;                                        //contador impares
        for (int i = 0; i < v.length; i++) {
            if (v[i] % n == 0) {
                a++;
            }
        }
        int res[] = new int[a];
        for (int i = 0, f = 0; i < v.length; i++) {
            if (v[i] % n == 0) {
                res[f] = v[i];
                f++;
            }
        }
        return res;
    }

}
