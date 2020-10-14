/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourcad;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mateu
 */
public class Form_CadConcessionariaController implements Initializable {

    @FXML
    private BorderPane mainPane;
    @FXML
    private AnchorPane ancPane_TelaInicio;
    @FXML
    private MenuBar menuBar_TelaInicial;
    @FXML
    private MenuItem menuItem_CadCliente;
    @FXML
    private MenuItem menuItem_CadConta;
    @FXML
    private MenuItem menuItem_CadConcessionaria;
    @FXML
    private TextField txtFld_NomeConcessionaria;
    @FXML
    private TextField txtFld_CnpjConcessionaria;
    @FXML
    private TextField txtFld_InscEstadualConcessionaria;
    @FXML
    private TextField txtFld_EmailConcessionaria;
    @FXML
    private TextField txtFld_SiteConcessionaria;
    @FXML
    private TextField txtFld_CepConcessionaria;
    @FXML
    private TextField txtFld_NumEndConcessionaria;
    @FXML
    private TextField txtFld_CompEndConcessionaria;
    @FXML
    private TextField txtFld_EndConcessionaria;
    @FXML
    private TextField txtFld_CidadeConcessionaria;
    @FXML
    private TextField txtFld_UfEndConcessionaria;
    @FXML
    private Button btn_CadConcessionaria;
    @FXML
    private Button btn_LimparConcessionaria;
    @FXML
    private MenuItem menuItem_PesqCliente;
    @FXML
    private MenuItem menuItem_PesqConta;
    @FXML
    private MenuItem menuItem_PesqConcessionaria;
    @FXML
    private TextField txtFld_UfEndConcessionaria1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        // INICIO MENU BAR //
    // FUNÇÃO PARA ABRIR TELA A PARTIR DE MENU BAR 
    @FXML
    public void gotoCliente(ActionEvent event) throws IOException{ 
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Form_CadCliente.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void gotoConta(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Form_CadConta.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void gotoConcessionaria(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Form_CadConcessionaria.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    
    // FIM MENU BAR //
    
        @FXML
    private void btn_Limpar(ActionEvent event) {
        txtFld_NomeConcessionaria.setText("");
        txtFld_CnpjConcessionaria.setText("");
        txtFld_InscEstadualConcessionaria.setText("");
        txtFld_EmailConcessionaria.setText("");
        txtFld_SiteConcessionaria.setText("");
        txtFld_CepConcessionaria.setText("");
        txtFld_NumEndConcessionaria.setText("");
        txtFld_CompEndConcessionaria.setText("");
        txtFld_EndConcessionaria.setText("");
        txtFld_CidadeConcessionaria.setText("");
        txtFld_UfEndConcessionaria.setText("");
    }

    
}
