import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javax.swing.*;

public class IndexController {
    public Label detection;
    public TextArea detectEditor;

    public void detect(ActionEvent actionEvent) {
        String text = detectEditor.getText().replaceAll("\n", System.getProperty("line.separator"));
        detection.setText(text);
    }
}
