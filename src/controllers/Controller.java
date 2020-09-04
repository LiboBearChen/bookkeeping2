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
    private Pane pnlOrders;

    @FXML
    private Pane pnlCustomers;

    @FXML
    private VBox pnItems;

    @FXML
    private Button btnOverview;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnCustomers;

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
            pnlOrders.setVisible(false);
            pnlCustomers.setVisible(false);
        }
        if (actionEvent.getSource() == btnOrders) {
            pnlOverview.setVisible(false);
            pnlOrders.setVisible(true);
            pnlCustomers.setVisible(false);
        }
        if (actionEvent.getSource() == btnCustomers) {
            pnlOverview.setVisible(false);
            pnlOrders.setVisible(false);
            pnlCustomers.setVisible(true);
        }
    }
}
