package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {



    @FXML
    private Pane pnlOverview;

    @FXML
    private Pane pnlInvoice;

    @FXML
    private Pane pnlInvoiceIn;

    @FXML
    private Pane pnlInvoiceOut;

    @FXML
    private Pane pnlStock;

    @FXML
    private Pane pnlStockIn;

    @FXML
    private Pane pnlStockOut;

    @FXML
    private VBox pnItems;

    @FXML
    private Button btnOverview;

    @FXML
    private Button btnInvoice;

    @FXML
    private Button btnInvoiceIn;

    @FXML
    private Button btnInvoiceOut;

    @FXML
    private Button btnStock;

    @FXML
    private Button btnStockIn;

    @FXML
    private Button btnStockOut;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes=new Node[100];
        for(int i=0;i<nodes.length;i++){
            try {
                nodes[i]=FXMLLoader.load(getClass().getResource("/views/Item.fxml"));
                pnItems.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnOverview) {
            pnlOverview.setVisible(true);
            pnlInvoice.setVisible(false);
            pnlInvoiceIn.setVisible(false);
            pnlInvoiceOut.setVisible(false);
            pnlStock.setVisible(false);
            pnlStockIn.setVisible(false);
            pnlStockOut.setVisible(false);
        }
        if (actionEvent.getSource() == btnInvoice) {
            pnlOverview.setVisible(false);
            pnlInvoice.setVisible(true);
            pnlInvoiceIn.setVisible(false);
            pnlInvoiceOut.setVisible(false);
            pnlStock.setVisible(false);
            pnlStockIn.setVisible(false);
            pnlStockOut.setVisible(false);
        }
        if (actionEvent.getSource() == btnInvoiceIn) {
            pnlOverview.setVisible(false);
            pnlInvoice.setVisible(false);
            pnlInvoiceIn.setVisible(true);
            pnlInvoiceOut.setVisible(false);
            pnlStock.setVisible(false);
            pnlStockIn.setVisible(false);
            pnlStockOut.setVisible(false);
        }
        if (actionEvent.getSource() == btnInvoiceOut) {
            pnlOverview.setVisible(false);
            pnlInvoice.setVisible(false);
            pnlInvoiceIn.setVisible(false);
            pnlInvoiceOut.setVisible(true);
            pnlStock.setVisible(false);
            pnlStockIn.setVisible(false);
            pnlStockOut.setVisible(false);
        }
        if (actionEvent.getSource() == btnStock) {
            pnlOverview.setVisible(false);
            pnlInvoice.setVisible(false);
            pnlInvoiceIn.setVisible(false);
            pnlInvoiceOut.setVisible(false);
            pnlStock.setVisible(true);
            pnlStockIn.setVisible(false);
            pnlStockOut.setVisible(false);
        }
        if (actionEvent.getSource() == btnStockIn) {
            pnlOverview.setVisible(false);
            pnlInvoice.setVisible(false);
            pnlInvoiceIn.setVisible(false);
            pnlInvoiceOut.setVisible(false);
            pnlStock.setVisible(false);
            pnlStockIn.setVisible(true);
            pnlStockOut.setVisible(false);
        }
        if (actionEvent.getSource() == btnStockOut) {
            pnlOverview.setVisible(false);
            pnlInvoice.setVisible(false);
            pnlInvoiceIn.setVisible(false);
            pnlInvoiceOut.setVisible(false);
            pnlStock.setVisible(false);
            pnlStockIn.setVisible(false);
            pnlStockOut.setVisible(true);
        }
    }
}
