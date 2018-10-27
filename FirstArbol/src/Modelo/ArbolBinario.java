package Modelo;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {

    }

    public ArbolBinario(Nodo raiz) {

        this.raiz = raiz;

    }

    public static Nodo nuevoArbol(Nodo left, Object dato, Nodo right) {

        return new Nodo(left, dato, right);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public static void preOrden(Nodo obj) {

        System.out.println(obj.getDato());

        // Recorremos la izquierda
        if (obj.getLeft() != null) {

            preOrden(obj.getLeft());

        }
        //Recorremos la derecha
        if (obj.getRight() != null) {

            preOrden(obj.getRight());

        }

    }

    public static void inOrden(Nodo obj) {

        if (obj.getLeft() != null) {
            inOrden(obj.getLeft());
        }

        System.out.println(obj.getDato());

        if (obj.getRight() != null) {

            inOrden(obj.getRight());

        }

    }

    public static void postOrden(Nodo obj) {

        if (obj.getLeft() != null) {

            postOrden(obj.getLeft());

        }

        if (obj.getRight() != null) {

            postOrden(obj.getRight());

        }

        System.out.println(obj.getDato());

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
