package com.vanas.game.dracak;

public class DuelArena {
    public static final int dobaTrvaniKola = 5;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("");
        System.out.println("/************************************************KUBA*****************************************************/");
        // zalozi hrace a prida mu zbran
        Hrac kuba = new Hrac("Kuba", 100, 1, 2, Predmet.listZbrani()[RandomGenerator.randomZRozsahu(0,4)]);
        System.out.println("Zbran: ");
        System.out.println(kuba.getZbran().toString());

        // vygeneruje zbroje
        Predmet[] zbrojeKuba = new Predmet[RandomGenerator.randomZRozsahu(1, 2)];
        System.out.println("Zbroje: ");
        for (int i = 0; i < zbrojeKuba.length; i++) {
            zbrojeKuba[i] = Predmet.listZbroje()[RandomGenerator.randomZRozsahu(0, 4)];
            System.out.println(zbrojeKuba[i].toString());
        }

        // vygeneruje itemy
        Predmet[] itemyKuba = new Predmet[RandomGenerator.randomZRozsahu(1, 2)];
        System.out.println("Itemy: ");
        for (int i = 0; i < itemyKuba.length; i++) {
            itemyKuba[i] = Predmet.listItemu()[RandomGenerator.randomZRozsahu(0, 4)];
            System.out.println(itemyKuba[i].toString());
        }

        System.out.println("");
        System.out.println("/************************************************DAN*****************************************************/");
        // zalozi hrace a prida mu zbran
        Hrac dan = new Hrac("Dan", 100, 1, 2, Predmet.listZbrani()[RandomGenerator.randomZRozsahu(0,4)]);
        System.out.println("Zbran: ");
        System.out.println(dan.getZbran().toString());

        // vygeneruje zbroje
        Predmet[] zbrojeDan = new Predmet[RandomGenerator.randomZRozsahu(1, 2)];
        System.out.println("Zbroje: ");
        for (int i = 0; i < zbrojeDan.length; i++) {
            zbrojeDan[i] = Predmet.listZbroje()[RandomGenerator.randomZRozsahu(0, 4)];
            System.out.println(zbrojeDan[i].toString());
        }

        // vygeneruje itemy
        Predmet[] itemyDan = new Predmet[RandomGenerator.randomZRozsahu(1, 2)];
        System.out.println("Itemy: ");
        for (int i = 0; i < itemyDan.length; i++) {
            itemyDan[i] = Predmet.listItemu()[RandomGenerator.randomZRozsahu(0, 4)];
            System.out.println(itemyDan[i].toString());
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        Thread.sleep(10000);

        System.out.println("/************************************************GAME*****************************************************/");

        int kubovoZivoty = kuba.getZivoty();
        int danovoZivoty = dan.getZivoty();
        int kolo = 1;

        int kubaUtok, kubaObrana;
        int danUtok, danObrana;

        while (kubovoZivoty > 0 && danovoZivoty > 0) {
            System.out.println(kolo + " KOLO");
            System.out.println("");

            kubaUtok = kuba.vyslednyUtok(kuba, itemyDan);
            kubaObrana = Hrac.vyslednaObrana(kuba.getObrana(), zbrojeKuba);
            danUtok = dan.vyslednyUtok(dan, itemyDan);
            danObrana = Hrac.vyslednaObrana(dan.getObrana(), zbrojeDan);

            if (kubaUtok - danObrana > 0) {
                danovoZivoty -= danUtok - danObrana;
            }
            if (danUtok - kubaObrana > 0) {
                kubovoZivoty -= kubaUtok - kubaObrana;

            }

            if (kuba.criticalDamage != 0) {
                System.out.println("Kuba critnul Dana za " + kuba.getCriticalDamage());
            }
            if (dan.criticalDamage != 0) {
                System.out.println("Dan critnul Kubu za " + dan.getCriticalDamage());
            }

            System.out.println("Kuba " + kubovoZivoty);
            System.out.println("Dan " + danovoZivoty);
            System.out.println("");

            Thread.sleep(1000);
            kolo++;

            if (kubovoZivoty < 0 && danovoZivoty < 0) {
                System.out.println("REMIZA");
            } else if (kubovoZivoty > 0 && danovoZivoty < 0) {
                System.out.println("VITEZ KUBA");

            } else if (danovoZivoty > 0 && kubovoZivoty < 0) {
                System.out.println("VITEZ DAN");
            }
        }

    }
}
