package com.pern1k.console;

import java.util.Scanner;
import java.util.logging.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public class Console {
    private static final Logger log = Logger.getLogger("Console");
    private static final Scanner scanner = new Scanner(System.in);

    private static int hodKostkou() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        boolean running = true;

        Map<String, String> commandMap = new HashMap<>();
        commandMap.put("whoami", " / Zobrazi informace o me.");
        commandMap.put("420", " / Zobrazi hype.");
        commandMap.put("help", " / Zobrazi vsechny prikazy v appce.");
        commandMap.put("exit", " / Vypne aplikaci.");
        commandMap.put("quit", " / Vypne aplikaci.");
        commandMap.put("kuba", " / Zobrazi info o Kubovi.");
        commandMap.put("dan", " / Zobrazi info o Danovi.");

        String[] kubaInventory = new String[]{"Mec", "Luk", "Stit", "mesec", "zbroj"};
        Person kuba = new Person("Jakub", "VANA", true, 29, kubaInventory);
        String[] danInventory = new String[]{"Weed", "Bong", "blunt", "junk", "cirkurka"};
        Person dan = new Person("Daniel", "Pernik", true, 30, danInventory);

        // Configure the logger
        Nastaveni.nastavMiKonzoliBezSracek();

        log.info("Vítej v mojí superb konzoli. Napiš 'help' k zobrazení možných příkazů.");
        while (running) {
            String textInput = scanner.nextLine();
            if ("who am I".equals(textInput)) {
                log.info("Ty jsi přece slon v pokoji.");
            } else if ("Kubuv inventar".equals(textInput)) {
                for (String item : kuba.inventory) {
                    System.out.println("- " + item);
                }
            } else if ("Danuv inventar".equals(textInput)) {
                for (String item : dan.inventory) {
                    System.out.println("- " + item);
                }
            } else if ("Hod!".equals(textInput)) {
                int hod = hodKostkou();
                log.info("Hod kostkou: " + hod);
            } else if ("420".equals(textInput)) {
                log.info("Ma maaaaaan!!! Always!!!");
            } else if ("help".equals(textInput)) {
                for (Map.Entry<String, String> entry : commandMap.entrySet()) {
                    log.info("Kdyz zadas prikaz -  " + entry.getKey() + "" + entry.getValue());
                }
            } else if ("exit".equals(textInput) || "quit".equals(textInput)) {
                running = false;
            } else if ("kuba".equals(textInput)) {
                log.info("Kubovo vek je: " + kuba.age + " a jmeno je " + kuba.name);
            } else if ("dan".equals(textInput)) {
                log.info("Danovo vek je: " + dan.age + " a jmeno je " + dan.name);
            } else {
                log.info(textInput + " je neznámý příkaz.");
            }
        }
    }
}
