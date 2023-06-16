package co.develhope.introduction;

public class Whilevero {

    public static void main(String[] args) {


//ogg---> tu
        //classe --> copia ---- creare altroi oggetti
        int bot = 10000;
        int poundVendutiFodDay = 1000;

        int contday = 0;

        for (int i = poundVendutiFodDay; i < bot; i += poundVendutiFodDay) {


//for (int i=0;i< )

            double tassocambio = 0;

            while (tassocambio < 1.15) {

                //1 euro =1,30 sterline
                tassocambio = 1 + (Math.random() * 0.2);
                //count=count +1;
                contday++;
                System.out.println("non si puo cambiare nulla oggi");
                System.out.println("oggi è il giorno " + contday);
            }
            System.out.println("oggi si stanno vendendo " + poundVendutiFodDay + " sterline per oggi che è il giorno " + contday);

            System.out.println("il tasso di cambio è favorevole si puo cambiare");
        }

System.out.println("si devono avere " + contday+"per vendere tutto");
    }
}
