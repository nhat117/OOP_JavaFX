import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
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
    public void cirMove(MouseEvent mouseEvent) {
        System.out.println("Circle is move");

    }
}
