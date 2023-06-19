package co.develhope.introduction.javadoc;



//gioco di parole---> classe che viene usata per la creazione dell oggetto che rappresenta l istanza della classe
public class WordGames {

/*
* metodo che concatena due stringhe e viene richiamato nel main dopo aver creato l oggetto
* */
    public String addHelloWord(String word)
    {
        return "hello " + word ;
    }

//metodo che @return nome e cognome, anch esso viene richiamato nel main dopo la creazione dell oggetto
    //
           public String getFullName(String name, String surname)
           {
return name + " "+ surname;
           }



}
