package com.vanas.game.dracak;

import java.util.Arrays;

public class Hrac {
    public String jmeno;
    public int zivoty;
    public int utok;
    public int obrana;
    public Predmet zbran;
    public Predmet[] inventar;

    public  int criticalDamage = 0;

    public Hrac() {

    }

    public Hrac(String jmeno, int zivoty, int utok, int obrana, Predmet zbran) {
        this.jmeno = jmeno;
        this.zivoty = zivoty;
        this.utok = utok;
        this.obrana = obrana;
        this.zbran = zbran;
        inventar = new Predmet[5];
    }

    public static int vyslednaObrana(int obranaHrace, Predmet[] listZbroji) {
        int vysledek = obranaHrace;
        for (Predmet zbroj : listZbroji) {
            vysledek += zbroj.getObranaBonus();
        }
        return vysledek;
    }

    public int vyslednyUtok(Hrac hrac, Predmet[] listItemu) {
        int vysledek = hrac.getUtok() + hrac.getZbran().getUtok();
        int critChance = 0;
        for (Predmet item : listItemu) {
            vysledek += item.getUtokBonus();
            critChance += item.getCritChance();
        }
        if (RandomGenerator.randomZRozsahu(0, 100) < critChance) {
            vysledek += hrac.getZbran().getUtokBonus();
            setCriticalDamage(vysledek);
        } else {
            setCriticalDamage(0);
        }
        return vysledek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getZivoty() {
        return zivoty;
    }

    public void setZivoty(int zivoty) {
        this.zivoty = zivoty;
    }

    public int getUtok() {
        return utok;
    }

    public void setUtok(int utok) {
        this.utok = utok;
    }

    public int getObrana() {
        return obrana;
    }

    public void setObrana(int obrana) {
        this.obrana = obrana;
    }

    public Predmet[] getInventar() {
        return inventar;
    }

    public void setInventar(Predmet[] inventar) {
        this.inventar = inventar;
    }

    public Predmet getZbran() {
        return zbran;
    }

    public void setZbran(Predmet zbran) {
        this.zbran = zbran;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    @Override
    public String toString() {
        return "Hrac{" +
                "jmeno='" + jmeno + '\'' +
                ", zivoty=" + zivoty +
                ", utok=" + utok +
                ", obrana=" + obrana +
                '}';
    }
}
