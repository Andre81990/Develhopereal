package co.develhope.introduction.co.develhope.introduction;

public class Tester {

    public static void main(String[] args) {


        Employee em = new Employee("andrea","ottolino","via borgomanero ");
        Employee em2 = new Employee("elio","barbone", "via gaidano 8");

        Badge b1=new Badge(em);
        Badge b2=new Badge(em2);

      //  System.out.println(em);
        //System.out.println(em2);



        b1.showBadgeDetails();
        b2.showBadgeDetails();

    }

    /*
    * creare il loro nuovo 2Badge
mostrare all'utente i dati del tesserino dei 2 dipendenti
    *
    * */
}
