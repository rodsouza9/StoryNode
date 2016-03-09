package sample;

/**
 * Created by Rohan D'Souza on 3/6/2016.
 */
public class IllegalStoryNodeExecution extends Exception{
    public IllegalStoryNodeExecution() {
        super();
    }

    public IllegalStoryNodeExecution(String message) {
        super(message);
    }

    public IllegalStoryNodeExecution(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalStoryNodeExecution(Throwable cause) {
        super(cause);
    }

    public IllegalStoryNodeExecution(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
