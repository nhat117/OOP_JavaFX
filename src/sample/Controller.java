package sample;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Controller {
    @FXML
    Circle cir1;

    @FXML
    Circle cir2;

    @FXML
    Line line;

    @FXML
    protected void  cirMove() {
        System.out.println("Circle is move");
    }

}
