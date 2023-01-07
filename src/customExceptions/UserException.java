package customExceptions;

/*
* catches exception related to user input
* input mismatch, invalid inputs
 */

public class UserException extends Exception{
    public UserException(String message){
        // some message & info to be displayed
        super(message);
    }

}
