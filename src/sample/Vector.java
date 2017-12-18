package sample;

import javafx.scene.control.Label;

import java.util.Arrays;

public class Vector {
    static int vect[]= new int[ArbolBinario.getIndex()];
    static int vect1[]= new int[ArbolBinario.getIndex()];
    static int vect2[]= new int[ArbolBinario.getIndex()];

    static int i=0;
    static int j=0;
    static int k=0;

    public static void insertarVector(int dato) {
        vect[i] = dato;
        i++;
    }
    public static void insertarVector1(int dato) {
        vect1[j] = dato;
        j++;
    }
    public static void insertarVector2(int dato) {
        vect2[k] = dato;
        k++;
    }

    static Label mostrar(){
        Label label= new Label(Arrays.toString(vect));
        return label;
    }
    static Label mostrar1(){
        Label label= new Label(Arrays.toString(vect1));
        return label;
    }

    static Label mostrar2(){
        Label label= new Label(Arrays.toString(vect2));
        return label;
    }

    public static int[] BurbujaMejorada(int[] vect) {
        int buffer;
        int i,j;
        for(i = 0; i < vect.length; i++)
        {
            for(j = 0; j < i; j++)
            {
                if(vect[i] < vect[j])
                {
                    buffer = vect[j];
                    vect[j] = vect[i];
                    vect[i] = buffer;
                }
            }
        }
        return vect;

    }

    public static int menor(){

        int[] vectorOrde=BurbujaMejorada(vect);
        return vectorOrde[0];
    }

    public static int mayor(){

        int[] vectorOrde=BurbujaMejorada(vect);
        return vectorOrde[vect.length-1];
    }




}
