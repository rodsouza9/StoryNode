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

    StoryNode() {
        this.prompt  = null;
        this.message = null;
        this.option1 = null;
        this.option2 = null;
    }
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
        this.option1 = null;
        this.option2 = null;
    }
    public StoryNode(String message) {
        this.prompt = null;
        this.message = message;
        this.option1 = null;
        this.option2 = null;
    }


    public String getMessage() {
        return message;
    }
    public String getPrompt() {return prompt;}
    public StoryNode getOption1() {return option1;}
    public StoryNode getOption2() {return option2;}


    private static int count = 0;
    public StoryNode executePath() throws IllegalStoryNodeExecution{
        count++;
        if ( count == 1 && !isThere(getMessage()) ) {
            throw new IllegalStoryNodeExecution("There is no message for the first node");
        }
        else if (count > 1 && !isThere(prompt)) {
            throw new IllegalStoryNodeExecution("prompt was not found");
        }
        /*else if () {

        }*/
        return null;

    }
    public StoryNode decidePath() {
        StoryNode[] messages = {option1, option2};
        String[] promptMessages = {messages[0].prompt, messages[1].prompt};
        int choice = JOptionPane.showOptionDialog(null,
                getMessage(),
                "A Silly Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                promptMessages,  //the titles of buttons
                promptMessages[0]); //default button title
        return (choice == 0) ? messages[0] : messages[1];
    }
    public static boolean isThere(String string) {return !(string == null || string.equals(""));}

    public String toString() {
        return message;
    }
}