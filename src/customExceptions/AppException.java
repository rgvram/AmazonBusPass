package customExceptions;

/*
* system exception related to DB or class or file
* throw a custom message
 */

public class AppException extends Exception{
    public AppException(String message){
        //Some Message & info to be displayed
        super(message);
    }

}
