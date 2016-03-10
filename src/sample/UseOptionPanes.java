package sample;// Shows several JOptionPane windows on the screen.

import javax.swing.*; // for GUI components
public class UseOptionPanes {
    private StoryNode start;
    /*public void executePath(StoryNode start) throws IllegalStoryNodeExecution{
        this.start = start;
        *//* DO NOT DO THIS >>> If the start has a prompt before the while, then throw an exception
         *  If the start has no message before the while, then throw an exception
         *  If the start has null for option1 and option2, then throw an exception
         *
         *  If the start has a reference for option1 and option2, then begin the while loop.
         *
         *  In while loop:
         *  ** the first node should have (only): message, option1, option2
         *                                   or : message, option1
         *                                   or : message, option2
         *  ** the last  node should have (only): prompt, message
         *                                   or : prompt
         *                                   or : prompt, message
         *//*
        if (
            ( (start.getMessage() == null) || (start.getMessage().equals("")) ) ||
            ( (start.getOption1() == null) || (start.getOption1().equals("")) ) ||
            ( (start.getOption2() == null) || (start.getOption2().equals("")) ) ||
            ) {

        }
        while (4 == 4) {
            this.start = this.start.decidePath();
        }

    }*/
    public static boolean isThere(String string) {return !(string == null || string.equals(""));}

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name + ".");
        StoryNode first = new StoryNode("If one guys is named Rohan, and his brother is named Rahul..." +
                "Who would you give candy to??",new StoryNode("Rohan", "Yup!! That's the correct answer!"), new StoryNode("Rahul", "Ew u need to rethink ur life decisions!"));

        first.decidePath();

    }
}