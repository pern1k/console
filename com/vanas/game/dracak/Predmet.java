package com.vanas.game.dracak;

public class Predmet {

    public String jmeno;
    public int utok;
    public int critChance;
    public int critBonus;
    public int utokBonus;
    public int obranaBonus;

    public Predmet() {

    }

    public Predmet(String jmeno, int utok, int critChance, int critBonus, int utokBonus, int obranaBonus) {
        this.jmeno = jmeno;
        this.utok = utok;
        this.critChance = critChance;
        this.critBonus = critBonus;
        this.utokBonus = utokBonus;
        this.obranaBonus = obranaBonus;
    }

    public static Predmet[] listZbrani() {
        Predmet[] zbrane = new Predmet[5];
        zbrane[0] = new Predmet("Klacek", 2, 5, 5, 0, 0);
        zbrane[1] = new Predmet("Kudla", 4, 10, 10, 0, 0);
        zbrane[2] = new Predmet("Kyj", 7, 10, 7, 0, 0);
        zbrane[3] = new Predmet("Mec", 6, 15, 10, 0, 0);
        zbrane[4] = new Predmet("Kopi", 5, 30, 15, 0, 0);
        return zbrane;
    }

    public static Predmet[] listZbroje() {
        Predmet[] zbrane = new Predmet[5];
        zbrane[0] = new Predmet("Sandal", 0, 0, 0, 0, 1);
        zbrane[1] = new Predmet("Rukavky", 0, 0, 0, 0, 3);
        zbrane[2] = new Predmet("Stit", 0, 0, 0, 0, 5);
        zbrane[3] = new Predmet("Konopna kape", 0, 0, 0, 0, 9);
        zbrane[4] = new Predmet("Mlynarska tunika", 0, 0, 0, 0, 4);
        return zbrane;
    }

    public static Predmet[] listItemu() {
        Predmet[] zbrane = new Predmet[5];
        zbrane[0] = new Predmet("Face tattoo", 0, 10, 0, 3, 1);
        zbrane[1] = new Predmet("Blunt osviceni", 0, 15, 0, 2, 5);
        zbrane[2] = new Predmet("Drticka stesti", 0, 20, 0, 3, 1);
        zbrane[3] = new Predmet("Hodinky osudu", 0, 5, 0, -4, -8);
        zbrane[4] = new Predmet("Dohasinajici cirkurka", 0, 5, 0, 6, -1);
        return zbrane;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getUtok() {
        return utok;
    }

    public void setUtok(int utok) {
        this.utok = utok;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCritBonus() {
        return critBonus;
    }

    public void setCritBonus(int critBonus) {
        this.critBonus = critBonus;
    }

    public int getUtokBonus() {
        return utokBonus;
    }

    public void setUtokBonus(int utokBonus) {
        this.utokBonus = utokBonus;
    }

    public int getObranaBonus() {
        return obranaBonus;
    }

    public void setObranaBonus(int obranaBonus) {
        this.obranaBonus = obranaBonus;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "jmeno='" + jmeno + '\'' +
                ", utok=" + utok +
                ", critChance=" + critChance +
                ", critBonus=" + critBonus +
                ", utokBonus=" + utokBonus +
                ", obranaBonus=" + obranaBonus +
                '}';
    }
}
