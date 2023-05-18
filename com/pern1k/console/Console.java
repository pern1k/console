package com.pern1k.console;

import java.util.Scanner;
import java.util.logging.Logger;

public class Console {
    private static final Logger log = Logger.getLogger("Console");
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        log.info("Vítej v mojí superb konzoli. Napiš 'help' k zobrazení možných příkazů.");
        while (running) {
            String textInput = scanner.nextLine();
            if ("whoami".equals(textInput)) {
                log.info("Ty jsi přece slon v pokoji.");
            }
            else if ("420".equals(textInput)) {
                log.info("Ma maaaaaan!!! Always!!!");
            } else if ("help".equals(textInput)) {
                log.info("Tady bude jednou manuál, jen ho musí nějakej človíček napřed naprgat.");
            } else if ("exit".equals(textInput)) {
                running = false;
            } else {
                log.info(textInput + " je neznámý příkaz.");
            }
        }
    }
}
