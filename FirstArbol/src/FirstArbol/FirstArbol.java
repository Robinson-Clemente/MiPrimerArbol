
package FirstArbol;

import Modelo.ArbolBinario;
import Modelo.Nodo;
import java.util.ArrayDeque;


public class FirstArbol {


    public static void main(String[] args) {
       
        Nodo left, right, raiz;
        ArrayDeque<Nodo> pila = new ArrayDeque();      
        
        left = ArbolBinario.nuevoArbol(null, "D",null );
        right = ArbolBinario.nuevoArbol(null, "E", null);
        raiz = ArbolBinario.nuevoArbol(left, "B",right);
        pila.push(raiz);
        
        left = ArbolBinario.nuevoArbol(null, "F", null);
        right = ArbolBinario.nuevoArbol(null, "G", null);
        raiz =  ArbolBinario.nuevoArbol(left,"C",right);
        pila.push(raiz);
        
        
        right = pila.pop();
        left = pila.pop();
        raiz = ArbolBinario.nuevoArbol(left, "A", right);
        ArbolBinario arboltotal = new ArbolBinario(raiz);
        
        
    }
    
}
