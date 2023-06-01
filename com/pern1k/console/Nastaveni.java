package com.pern1k.console;

import java.util.logging.*;

public class Nastaveni {

    /**
     * Nastavi logger aby nevypisoval datum
     */
    public static void nastavMiKonzoliBezSracek() {
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        for (Handler handler : handlers) {
            rootLogger.removeHandler(handler);
        }
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage() + System.lineSeparator();
            }
        });
        consoleHandler.setLevel(Level.ALL);
        rootLogger.addHandler(consoleHandler);
    }

}
