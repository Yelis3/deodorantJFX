import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.util.ArrayList;
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


    public LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> >> > datos1 = new LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> >> >();
    public LinkedList<Integer[]>[] datos2;// = new LinkedList<Integer[]>[]()
    public LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3;// = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
    public LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos4;// = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
    public LinkedList<couple<couple<String, Integer>, LinkedList<String> > > datos5;// = new LinkedList<couple<couple<String, Integer>, LinkedList<String> > >();

    public void detect(ActionEvent actionEvent) throws Exception {
        String text = detectEditor.getText().replaceAll("\n", System.getProperty("line.separator"));
        String[] code = text.split("\n");
        String smell = smells[smellIndex];
        String info = "";

        LinkedList<String> result = Detector.detect(code, smell, datos1, datos2, datos3, datos4, datos5);

        System.out.println(result);
        System.out.println(datos1);
        System.out.println(datos2);
        for (int i=0; i < result.size(); i++) {
            info = info + "Case " + i + ": " + result.get(i) + "\n";
        }
        detectionInfo.setText(info);
    }

    public void refactor(ActionEvent actionEvent) throws Exception {
        String smell = smells[smellIndex];
        System.out.println(datos1);
        System.out.println(datos2);
        String result = Refactor.refactor(smell, datos1, datos2, datos3, datos4, datos5);

        System.out.println(result);
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
