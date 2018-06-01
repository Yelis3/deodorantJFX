import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;

public class IndexController {
    public Label detectionInfo;
    public Label refactorInfo;
    public Label smellTitle;
    public TextArea detectEditor;
    public TextArea refactorEditor;
    public static final String[] smells = {"unusedParameters", "duplicatedConditionalFragments", "longParameterList"};
    public int smellIndex = 0;
    public static final String[] smellNames = {"Unused Parameter in Method", "Duplicated Conditional Fragments", "Long Parameter List"};

    public void detect(ActionEvent actionEvent) throws Exception {
        String text = detectEditor.getText().replaceAll("\n", System.getProperty("line.separator"));
        String[] text2 = text.split("\n");
        String smell = smells[smellIndex];

        LinkedList<String> result = Detector.detect(text2, smell);
        detectionInfo.setText("detector: " + smell);
    }

    public void refactor(ActionEvent actionEvent) {
        String text = detectEditor.getText().replaceAll("\n", System.getProperty("line.separator"));
        refactorInfo.setText("refactor: " + text);
    }

    public void prev(ActionEvent actionEvent) {
        if(smellIndex > 0)
            smellIndex --;
        smellTitle.setText(smellNames[smellIndex]);
    }

    public void next(ActionEvent actionEvent) {
        if(smellIndex < smells.length-1)
            smellIndex ++;
        smellTitle.setText(smellNames[smellIndex]);
    }
}
