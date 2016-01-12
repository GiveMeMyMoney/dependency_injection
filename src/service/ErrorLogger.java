package service;

/**
 * Created by Marcin on 2015-12-09.
 */
public class ErrorLogger implements ILogger {
    @Override
    public void printMsg(String className, String msg, String method) {
        System.out.println("Error in " + className + " with message: " + msg + "(" + method + ")");
    }
}
