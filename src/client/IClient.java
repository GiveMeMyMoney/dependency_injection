package client;

import service.ILogger;

/**
 * Created by Marcin on 2015-12-09.
 */
public interface IClient {
    void processMsg(String className, String msg);

    /**
     * Wstrzykiwanie zaleznosci przez interfejs
     */
    void setLoggerByInterface(ILogger logger);

}
