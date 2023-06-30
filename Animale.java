package AdvancedJava.Polimorfismo;




/*

un metodoanimalSound()


Cannot reproduce it properlyin altri casi
Definisci una classe tester in cui crei un
* Animal oggetto e chiami le 2 versioni del metodo
*
* */
public class Animale {


    public static void main(String[] args) {

Animale a=new Animale("cane");
a.animalSound();
a.animalSound("low");
a.animalSound("high");
a.animalSound("eiendind");
    }


   private String animalName;


    public Animale(String animalName) {
        this.animalName = animalName;
    }
public void  animalSound()

{
    System.out.println("roar");
}



    public void  animalSound(String intensity)

    {

        if (intensity=="high")
        System.out.println("roarrrrr");
        else if (intensity=="low")
        {

            System.out.println("roar");
        }

        else {System.out.println("Cannot reproduce it properly");
        }

    }


}
