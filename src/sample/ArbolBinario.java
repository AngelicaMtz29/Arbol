package sample;


import javafx.scene.control.Alert;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class ArbolBinario {

    public NodoArbol raiz;
    private static int index=0;


    public void preOr(NodoArbol raiz) {
        if (raiz != null) {
            Vector.insertarVector(raiz.getDato());
            preOr(raiz.getIzq());
            preOr(raiz.getDer());
        }

    }
    public void preOrden(){
        preOr(raiz);
    }

    public void InOr(NodoArbol raiz) {
        if (raiz != null) {
            InOr(raiz.getIzq());
            Vector.insertarVector1(raiz.getDato());
            InOr(raiz.getDer());
        }
    }
    public void inOrden(){
        InOr(raiz);
    }

    public void postOr(NodoArbol raiz) {

        if (raiz != null) {
            postOr(raiz.getIzq());
            postOr(raiz.getDer());
            Vector.insertarVector2(raiz.getDato());

        }
    }
    public void postOrden(){
        postOr(raiz);
    }


    //Método de buscar por valor
    public void buscarValor(int buscado) {
        boolean encontrado = false;
        NodoArbol raizSub = raiz;
        while (!encontrado && raizSub != null) {
            if (buscado == (raiz.getDato())) {
                encontrado = true;
                Alert alert= new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Búsqueda");
                alert.setHeaderText("Valor buscado: "+ buscado);
                alert.setContentText("Fue encontrado");
                alert.showAndWait();
            } else if (buscado < (raiz.getDato())) {
                raiz = raiz.getIzq();
            } else {
                raiz = raiz.getDer();
            }
        }
    }

    TreeItem<Integer> treeItemRoot= null;
    private TreeView insertar(int dato, NodoArbol raiz , TreeItem rama) {
        TreeItem<Integer> RamaDerecha;
        TreeItem<Integer> RamaIzquierda;
        if (dato > raiz.getDato()) {
            if (raiz.getDer()==null) {
                raiz.setDer(new NodoArbol(dato));
                RamaDerecha = new TreeItem<>(dato);
                rama.getChildren().addAll(RamaDerecha);
            }else {
                insertar(dato,raiz.getDer(), (TreeItem) rama.getChildren().get(1));
            }
        } else if (dato < raiz.getDato()){

            if (raiz.getIzq()==null) {
                raiz.setIzq(new NodoArbol(dato));
                RamaIzquierda= new TreeItem<>(dato);
                rama.getChildren().add(RamaIzquierda);
            }else {
                insertar( dato,raiz.getIzq(),(TreeItem) rama.getChildren().get(0));
            }
        }
        TreeView<Integer> treeView = new TreeView<>(treeItemRoot);
        return treeView;
    }
    public  TreeItem insertarNodo(int dato){
        if (raiz == null){
           raiz = new NodoArbol(dato);
            treeItemRoot = new TreeItem<>(raiz.getDato());
            index++;
        }else {
            insertar(dato,raiz,treeItemRoot);
            index++;
        }
        return treeItemRoot;
    }

    public static int getIndex() {
        return index;
    }

}

