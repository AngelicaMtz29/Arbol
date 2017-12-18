package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import java.net.URL;
import java.util.ResourceBundle;

//Se implementa el método para invocar a los controles utilizados en la interfaz.
public class Controller implements Initializable{

    @FXML
    HBox PreHBox, InHBox, PostHBox;

    @FXML
    Button BuscarBtn, PreBtn, PostBtn,InBtn, InsBtn,MenMayBtn;
    @FXML
    TextField ValorTxt;
    @FXML
     Label  MenorLbl, MayorLbl;
    @FXML
    TreeView Contenedor;

    //Objeto donde se almacenaran los demas sub-objetos
    ArbolBinario arbol = new ArbolBinario();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.InsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                int valor = Integer.parseInt(ValorTxt.getText());
                Contenedor.setRoot(arbol.insertarNodo(valor));
                ValorTxt.clear();
            }
        });

        this.MenMayBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MenorLbl.setText(String.valueOf(Vector.menor()));
                MayorLbl.setText(String.valueOf(Vector.mayor()));
            }
        });

        this.PreBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                arbol.preOrden();
                HBox hBox= new HBox();
                hBox.getChildren().addAll(Vector.mostrar());
                PreHBox.getChildren().add(hBox);

            }
        });

        this.InBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                arbol.inOrden();
                HBox hBox= new HBox();
                hBox.getChildren().addAll(Vector.mostrar1());
                InHBox.getChildren().add(hBox);

            }
        });

        this.PostBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                arbol.postOrden();
                HBox hBox= new HBox();
                hBox.getChildren().addAll(Vector.mostrar2());
                PostHBox.getChildren().add(hBox);


            }
        });

        this.BuscarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                arbol.buscarValor(Integer.parseInt(ValorTxt.getText()));
            }
        });
    }
}
