package injector;

import client.IClient;

/**
 * Created by Marcin on 2015-12-09.
 */
public interface ILoggerInjector {
    IClient getClientUsingConsructor();
    IClient getClientUsingSetter();
    IClient getClientUsingInterface();
}
