package gui;

import dal.MockData;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    public ListView ltvAllRestaurants;
    public Pane panMap;
    public ListView ltvSortedRestaurants;

    private MockData mockData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mockData = new MockData();
        ltvAllRestaurants.setItems((ObservableList) mockData.getAllRestaurants());

    }


    public void handleClearSortedLtv(ActionEvent event) {
    }

}
