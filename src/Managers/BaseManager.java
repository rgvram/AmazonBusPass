package Managers;

import customExceptions.AppException;

public class BaseManager {
    public static BaseManager getInstance() throws AppException{
        throw new AppException("class not implemented");
    }
}
