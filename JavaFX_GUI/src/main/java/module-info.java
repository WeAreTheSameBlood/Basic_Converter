module hlybchenko.gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens hlybchenko.gui to javafx.fxml;
    exports hlybchenko.gui;
}