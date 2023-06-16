package co.develhope.introduction;

public class Costruttore {



    /*
    * Definisci una classe di test (ad esempio Tester, Starto un altro nome ragionevole che preferisci) con un mainmetodo in cui:
---dichiari due Housevariabili house1ehouse2
---crei due Houseoggetti e li assegni alle variabili house1ehouse2
    *
    * */
    public static void main(String[] args) {


        Costruttore h1= new Costruttore("casa roma ", 3);
        Costruttore h2= new Costruttore("casa andrea",8);



System.out.println("la casa si chiama "+h1.address +" e ha un numero di "+h1.numberOfFloors +" camere");

        System.out.println("la casa si chiama "+h2.address +" e ha un numero di "+h2.numberOfFloors +" camere");


    }

        public String address;
        public int numberOfFloors;

    public Costruttore(String address, int numberOfFloors){
            this.address = address;
            this.numberOfFloors = numberOfFloors;
        }
    }
