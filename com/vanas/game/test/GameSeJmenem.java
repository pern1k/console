package com.vanas.game.test;

public class GameSeJmenem {
    public String verze;
    public String jmeno;

    public GameSeJmenem(String verze, String jmeno) {
        this.verze = verze;
        this.jmeno = jmeno;
    }

    public GameSeJmenem() {

    }


    public String dejMiVerzi() {
        return verze;
    }

    public void nastavVerzi(String verze) {
        this.verze = verze;
    }

    public String dejMiJmeno() {
        return jmeno;
    }
    public void nastavJmeno (String jmeno) {
        this.jmeno = jmeno;
    }
    private void spusteniHry() {
        System.out.println("Spusteno! " + verze + " " + jmeno);
    }


    public static void main(String[] args) {
        GameSeJmenem quake = new GameSeJmenem("0", "XY");
        quake.nastavVerzi("1.0.0");
        quake.nastavJmeno("Quake");
        quake.spusteniHry();

    }

}