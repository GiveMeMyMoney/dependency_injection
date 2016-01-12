package service;

/**
 * Created by Marcin on 2015-12-09.
 */
public class InfoLogger implements ILogger {
    @Override
    public void printMsg(String className, String msg, String method) {
        System.out.println("Info in " + className + " with message: " + msg + "(" + method + ")");
    }
}
