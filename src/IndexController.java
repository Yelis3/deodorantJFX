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
    public Label smellDescription;
    public Label solutionDescription;
    public Label solutionWhy;
    public Label solutionWhen;
    public TextArea detectEditor;
    public TextArea refactorEditor;
    public static final String[] smells = {"unusedParameters", "duplicatedConditionalFragments", "longParameterList"};
    public int smellIndex = 0;
    public static final String[] smellTitles = {"Unused Parameters", "Duplicate Conditional Fragments", "Long Parameter List"};
    public static final String[] smellDescriptions = {"One or several parameters are not used in the body of a method.", "Identical code can be found in all branches of a conditional.", "More than three or four parameters for a method."};
    public static final String[] solutionDescriptions = {"Remove the unused parameter.", "Move the code outside of the conditional.", "Check what values are passed to parameters."};
    public static final String[] solutionWhyDescriptions = {"A method contains only the parameters that it truly requires.\n", "Duplicate code is found inside all branches of a conditional, often as the result of evolution of the code within the conditional branches. Team development can be a contributing factor to this.", "More readable, shorter code. Refactoring may reveal previously unnoticed duplicate code."};
    public static final String[] solutionWhenDescriptions = {"If the method is implemented in different ways in subclasses or in a superclass, and your parameter is used in those implementations, leave the parameter as-is.", "It is recommended to use any time you see it doesn't causes troubles in your code.", "Do not get rid of parameters if doing so would cause unwanted dependency between classes."};


    public Data data = new Data();
    public LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> >> > datos1 = new LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> >> >();
    public LinkedList<LinkedList<Integer[]>> datos2 = new LinkedList<LinkedList<Integer[]>>();
    public LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3 = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
    public LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos4 = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
    public LinkedList<couple<couple<String, Integer>, LinkedList<String> > > datos5 = new LinkedList<couple<couple<String, Integer>, LinkedList<String> > >();

    public void detect(ActionEvent actionEvent) throws Exception {
        String text = detectEditor.getText().replaceAll("~", System.getProperty("line.separator"));
        String[] code = text.split("~");

        String smell = smells[smellIndex];
        String info = "";
        LinkedList<String> result = Detector.detect(code, smell, datos1, datos2, datos3, datos4, datos5);

        for (int i=0; i < result.size(); i++) {
            info = info + "Case " + i + ": " + result.get(i) + "\n";
        }
        detectionInfo.setText(info);
    }

    public void refactor(ActionEvent actionEvent) throws Exception {
        String smell = smells[smellIndex];
        String result = Refactor.refactor(smell, datos1, datos2, datos3, datos4, datos5);
        refactorEditor.setText(result);
    }

    public void prev(ActionEvent actionEvent) {
        if(smellIndex > 0)
            smellIndex --;
        setTexts(actionEvent);

	    String line = refactorEditor.getText();
	    if(line.length() != 0){
		    detectEditor.setText(line);
		    refactorEditor.setText("");
	    }

    }

    public void next(ActionEvent actionEvent) {
        if(smellIndex < smells.length-1)
            smellIndex ++;
        setTexts(actionEvent);
        String line = refactorEditor.getText();
        if(line.length() != 0){
        	detectEditor.setText(line);
        	refactorEditor.setText("");
        }
    }

    public void setTexts(ActionEvent actionEvent) {
        smellTitle.setText("Smell: " + smellTitles[smellIndex]);
        smellDescription.setText("Problem: " + smellDescriptions[smellIndex]);
        solutionDescription.setText("Solution: " + solutionDescriptions[smellIndex]);
        solutionWhy.setText("Why refactor: " + solutionWhyDescriptions[smellIndex]);
        solutionWhen.setText("When not to use: " + solutionWhenDescriptions[smellIndex]);
        detectionInfo.setText("");
    }
}
