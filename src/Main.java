import client.IClient;
import injector.ErrorLoggerInjector;
import injector.ILoggerInjector;
import injector.InfoLoggerInjector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marcin on 2015-12-09.
 */
public class Main {
    private static List<String> classNames = Arrays.asList("AsomeClass", "EmejzingClass");
    private static List<String> messages = Arrays.asList("nie umisz pisac", "nie umisz myslec");

    public static void main(String[] args) {
        ILoggerInjector injector = null;
        IClient app = null;

        //ERRORlogger
        /**
         * @see service.ErrorLogger
         */
        injector = new ErrorLoggerInjector();

        /// Wstrzykiwanie zaleznosci przez konstruktor
        app = injector.getClientUsingConsructor();
        app.processMsg(classNames.get(0), messages.get(0));

        /// Wstrzykiwanie zaleznosci przez SETTER
        app = injector.getClientUsingSetter();
        app.processMsg(classNames.get(0), messages.get(0));

        /// Wstrzykiwanie zaleznosci przez interfejs
        app = injector.getClientUsingInterface();
        app.processMsg(classNames.get(0), messages.get(0));

        System.out.println("----------------------------------------");

        //INFOlogger
        /**
         * @see service.InfoLogger
         */

        /// Wstrzykiwanie zaleznosci przez konstruktor
        injector = new InfoLoggerInjector();

        app = injector.getClientUsingConsructor();
        app.processMsg(classNames.get(1), messages.get(1));

        /// Wstrzykiwanie zaleznosci przez SETTER
        app = injector.getClientUsingSetter();
        app.processMsg(classNames.get(1), messages.get(1));

        /// Wstrzykiwanie zaleznosci przez interfejs
        app = injector.getClientUsingInterface();
        app.processMsg(classNames.get(1), messages.get(1));
    }
}
