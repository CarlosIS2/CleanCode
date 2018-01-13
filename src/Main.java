public class Main {

    public static void main(String args[]) {
        int v[] = {1,2,3,4,5,6,7,8,9,10};                       //creamos un vector
        int v2[] = {2,3,1,5,4,6,7,8,9,10};                      //creamos un segundo vector
        Vectores vector = new Vectores(v,v.length);             //creamos un objeto vector
        Vectores vector2 = new Vectores(v2,v2.length);          //creamos un segundo objeto vector

        for (int i = 0; i < vector.tamaño(v); i++) {
            System.out.println(v[i]);                           //mostramos el vector1
        }

        System.out.println("\n");

        for (int i = 0; i < vector.tamaño(v2); i++) {
            System.out.println(v2[i]);                          //mostramos el vector2
        }

        System.out.println("\n");


        System.out.println(vector.suma());                      //mostramos la suma de los elementos del vector 1

        System.out.println("\n");


        System.out.println(vector.resta());                     //mostramos la suma de los elementos del vector 2

        System.out.println("\n");

        for (int i = 0; i < vector.tamaño(v); i++) {
            System.out.println(vector.getV()[i] +vector2.getV()[i]);    //sumamos dos vectores
        }

        System.out.println("\n");

        for (int i = 0; i < vector.tamaño(vector.pares()); i++) {
            System.out.println(vector.pares()[i]);                          //mostramos elementos pares del vector 1
        }

        System.out.println("\n");

        for (int i = 0; i < vector.tamaño(vector.impares()); i++) {         //mostramos elementos impares del vector 1
            System.out.println(vector.impares()[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < vector.tamaño(vector.multiplo(5)); i++) {       //mostramos los elementos multiplos de 5 del vector dado
            System.out.println(vector.multiplo(5)[i]);
        }
    }
}