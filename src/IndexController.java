import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class IndexController {
    public Label detection;

    public void detect(ActionEvent actionEvent) {

        detection.setText("I am detecting!");
    }
}
