package com.vanas.game.test;

public class Game {
    // verze je promenna tridy Game
    public String verze;

    // Konstruktor tridy Game
    // Slouzi k vytvareni instanci tridy Game 
    // (instance je konkretni objekt typu konstruktoru te tridy, takze v pripade Game, bude instance treba Wowko, Tetris, Noita)
    // Prijima parametr verze a nastavuje ho do promenne vyse
    // Instanci mohu vytvorit kolik chci, takze mohu vytvorit vice her s ruznou verzi
    // Game noita = new Game("0");
    public Game(String verze) {
        this.verze = verze;
    }

    public Game() {

    }
    
    // Verejna metoda s navratovym typem String (text), jmenuje se dejMiVerzi
    // Vraci promennou verze, definovanou na zacatku tridy
    // noita.dejMiVerzi();
    public String dejMiVerzi() {
        return verze;
    }
    
    // Verejna metoda bez navratoveho typu(void), se jmenem nastavVerzi, ktera prijima paramnetr verze(musim ho definovat)
    // Nastavil jsem, ze verze, kterou predam teto metode je verze instance nad kterou metodu zavolam
    public void nastavVerzi(String verze) {
        this.verze = verze;
    }
    
    // Privatni metroda bez navratoveho typu se jmenem spusteniHry(jde volat pouze v ramci teto tridy)
    // Vypise do console "Spusteno" + promenou verze teto instance nad kterou to volam
    private void spusteniHry() {
        System.out.println("Spusteno! " + verze);
    }
    
    // Metoda main napsana dle java syntaxe, ktera spousti aplikaci a vykonava program v ni
    // 
    public static void main(String[] args) {
        // Zalozeni nove instance typu Game, s nazvem noita a verzi 0
        Game noita = new Game("0");
        // Zde jsem nadefinoval verzi svoji nove vytvoreny instanci noita a pomoci metody nastavVerzi jsem ji ulozil 1.0.0
        noita.nastavVerzi("1.0.0");
        // Vypise spusteno + aktualne nastavenou verzi
        noita.spusteniHry();


        Game warcraft = new Game();
        warcraft.nastavVerzi("1.1.0");
        warcraft.spusteniHry();

        Game morrowind = new Game("0");
        morrowind.nastavVerzi("9.1.0");
        morrowind.spusteniHry();
    }

}
