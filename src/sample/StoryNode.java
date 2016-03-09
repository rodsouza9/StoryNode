package sample;

import javax.swing.*;

/**
 * Created by Rohan D'Souza on 3/1/2016.
 */
public class StoryNode {
    private String prompt;
    private String message;
    private StoryNode option1;
    private StoryNode option2;

    StoryNode(String prompt, String message, StoryNode option1, StoryNode option2) {
        this.prompt  = prompt;
        this.message = message;
        this.option1 = option1;
        this.option2 = option2;
    }
    StoryNode(String message, StoryNode option1, StoryNode option2) {
        this.prompt  = null;
        this.message = message;
        this.option1 = option1;
        this.option2 = option2;
    }
    public StoryNode(String prompt, String message) {
        this.prompt = prompt;
        this.message = message;
        option1 = null;
        option2 = null;
    }
    public StoryNode(String message) {
        this.prompt = null;
        this.message = message;
        option1 = null;
        option2 = null;
    }


    public String getMessage() {
        return message;
    }
    public String getPrompt() {return prompt;}
    public StoryNode getOption1() {return option1;}
    public StoryNode getOption2() {return option2;}


    public StoryNode decidePath() {
        StoryNode[] messages = {option1, option2};
        int choice = JOptionPane.showOptionDialog(null,
                getMessage(),
                "A Silly Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                messages,  //the titles of buttons
                messages[0]); //default button title
        return (choice == 0) ? messages[0] : messages[1];
    }


    public String toString() {
        return message;
    }
}