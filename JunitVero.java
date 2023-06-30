package Junit;




/*
* Definisci una classe in cui hai 2 metodi statici:

subtraction che prende minuend e subtrahend  as int params e restituisce la differenza
multiplicationche prende multipliere multiplicandas int params e restituisce il prodotto
utilizzando JUnit, scrivere ed eseguire almeno 2 test per ogni metodo, dando all'utente alcune informazioni riguardo ogni test
*
* */
public class JunitVero

{

    public static void main(String[] args) {


        JunitVero j=new JunitVero();

j.Substraction(3,4);
j.Multipication(34,2);

    }


public static int Substraction(int minuend, int subtrahend)

{
    return minuend - subtrahend;
}

    public static int Multipication(int multiplier, int multiplicand)

    {
        return multiplier * multiplicand;
    }


}
