package client;

import service.ILogger;

/**
 * Created by Marcin on 2015-12-09.
 */
public class Client implements IClient {
    ILogger logger;
    private static final String METHOD_CONSTRUCTOR = "constructor";
    private static final String METHOD_SETTER = "setter";
    private static final String METHOD_INTERFACE= "interface";

    String methodType;

    public Client() {
    }

    /**
     * Wstrzykiwanie zaleznosci przez konstruktor
     */
    public Client(ILogger logger) {
        if (logger != null) {
            this.logger = logger;
            this.methodType = METHOD_CONSTRUCTOR;
        } else {
            //Throw
        }
    }

    /**
     * Wstrzykiwanie zaleznosci przez SETTER
     */
    public void setLogger(ILogger logger) {
        if (logger != null) {
            this.logger = logger;
            this.methodType = METHOD_SETTER;
        } else {
            //Throw
        }
    }

    /**
     * Wstrzykiwanie zaleznosci przez interfejs
     */
    @Override
    public void setLoggerByInterface(ILogger logger) {
        if (logger != null) {
            this.logger = logger;
            this.methodType = METHOD_INTERFACE;
        } else {
            //Throw
        }
    }

    @Override
    public void processMsg(String className, String msg) {
        this.logger.printMsg(className, msg, this.methodType);
    }
}
