package hlybchenko.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainArea {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonDistancesClass;

    @FXML
    private Button buttonDot;

    @FXML
    private Button buttonEight;

    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonRemove;

    @FXML
    private Button buttonSeven;

    @FXML
    private Button buttonSix;

    @FXML
    private Button buttonTemperClass;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonZero;

    @FXML
    private TextField textIODisplay;

    @FXML
    void initialize() {
        //need optimization
        buttonZero.setOnAction(actionEvent -> textIODisplay.appendText("0"));
        buttonOne.setOnAction(actionEvent -> textIODisplay.appendText("1"));
        buttonTwo.setOnAction(actionEvent -> textIODisplay.appendText("2"));
        buttonThree.setOnAction(actionEvent -> textIODisplay.appendText("3"));
        buttonFour.setOnAction(actionEvent -> textIODisplay.appendText("4"));
        buttonFive.setOnAction(actionEvent -> textIODisplay.appendText("5"));
        buttonSix.setOnAction(actionEvent -> textIODisplay.appendText("6"));
        buttonSeven.setOnAction(actionEvent -> textIODisplay.appendText("7"));
        buttonEight.setOnAction(actionEvent -> textIODisplay.appendText("8"));
        buttonNine.setOnAction(actionEvent -> textIODisplay.appendText("9"));
        buttonDot.setOnAction(actionEvent -> textIODisplay.appendText("."));
        buttonRemove.setOnAction(actionEvent -> textIODisplay.undo());
    }
}