package AdvancedEsercizi;


import AdvancedJava.Enum;

/*
* creare un'enumerazione Monthcon tutti i nomi dei mesi
iterare tutti i valori dell'enumerazione, stampando il nome del mese seguito da:
ends with yse il nome finisce con Y
doesn't end with yse il nome non finisce cony
* */
public class EnumES {


    enum Mesi {JANUARY,FEBRUARY,MARCH,APRIL};

    public static void main(String[] args) {
//ottenere la lunghezza
        for (Mesi m:Mesi.values()
             ) {

            String nomeFineMese=m.name();

            if (nomeFineMese.endsWith("Y"))
            {System.out.println("termina con y");
            }

            else if (nomeFineMese.endsWith("H")){
 System.out.println("non finisce con y");


            }
 else {

     System.out.println("no solution");
            }



        }

    }
}
