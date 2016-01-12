package injector;

import client.Client;
import client.IClient;
import service.ErrorLogger;

/**
 * Created by Marcin on 2015-12-09.
 */
public class ErrorLoggerInjector implements ILoggerInjector {
    @Override
    public IClient getClientUsingConsructor() {
        return new Client(new ErrorLogger());
    }

    @Override
    public IClient getClientUsingSetter() {
        Client client = new Client();
        client.setLogger(new ErrorLogger());
        return client;
    }

    @Override
    public IClient getClientUsingInterface() {
        Client client = new Client();
        client.setLoggerByInterface(new ErrorLogger());
        return client;
    }
}
