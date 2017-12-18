package sample;

public class NodoArbol {
    //Declaramos las variables
    public int dato;
    public NodoArbol izq;
    public NodoArbol der;
    private NodoArbol raiz = null;

    //Definimos el contructor
    public NodoArbol(int dato) {
        this.dato = dato;
    }

    //Para obtener el valor de los nodos
    public int getDato() {
        return dato;
    }

    //Método getter y setter del nodo raíz
    public NodoArbol getRaiz() {
        return raiz;
    }
    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    //Especificamos los get de los nodos izquierda y derecha
    public NodoArbol getIzq() {
        return izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    //Especificamos los set de los nodos izquierda y derecha
    public void setDer(NodoArbol nodo) { der = nodo; }

    public void setIzq(NodoArbol nodo) {
        izq = nodo;
    }



}
