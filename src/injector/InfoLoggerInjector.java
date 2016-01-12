package injector;

import client.Client;
import client.IClient;
import service.InfoLogger;

/**
 * Created by Marcin on 2015-12-09.
 */
public class InfoLoggerInjector implements ILoggerInjector {
    @Override
    public IClient getClientUsingConsructor() {
        return new Client(new InfoLogger());
    }

    @Override
    public IClient getClientUsingSetter() {
        Client client = new Client();
        client.setLogger(new InfoLogger());
        return client;
    }

    @Override
    public IClient getClientUsingInterface() {
        Client client = new Client();
        client.setLoggerByInterface(new InfoLogger());
        return client;
    }
}
