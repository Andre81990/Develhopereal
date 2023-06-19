package co.develhope.introduction.javadoc;



// classe di test usata per la verifica dei metodi creati nella classe e per la creazione di new objects
public class Tester {

    public static void main(String[] args) {


        WordGames wg=new WordGames();
       System.out.println(wg.addHelloWord("mondo"));

       System.out.println(wg.getFullName("andrea","otto"));
    }
}
