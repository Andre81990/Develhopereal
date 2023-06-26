package AdvancedJava;





/*
Define a testing class with a main() method where you:

create an HashSet with all the days of the week and print the content of the HashSet
create another implementation of Set that preserves the insertion order of the days of the week and print it
print the new Set
print the answer to the question Is the first Set equal to the second one?

*/


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setprima
{


    public static void main(String[] args) {
        Set<String> daysWeek=new HashSet<String>();


        System.out.println("questo è un hashset :");
        
        daysWeek.add("lunedi");
        daysWeek.add("martedi");
        daysWeek.add("mercoledi");
        daysWeek.add("giovedi");
        daysWeek.add("venerdi");
        daysWeek.add("sabato");
        daysWeek.add("domenica");

        for (String d:daysWeek)
        {

            System.out.println(d);
            
        }

System.out.println("questo è il treeset :");


        TreeSet<String> giorni= new TreeSet<String>();
        giorni.add("lunedi");
        giorni.add("martedi");
        giorni.add("mercoledi");
        giorni.add("giovedi");
        giorni.add("venerdi");
        giorni.add("sabato");
        giorni.add("domenica");




            System.out.println(giorni);


        LinkedHashSet<String> gio=new LinkedHashSet<String>();
        System.out.println("questo è linkedhaskset :");
        gio.add("lun");
        gio.add("mar");
        gio.add("mer");
        gio.add("giov");
        gio.add("ven");
        gio.add("sabato");
        gio.add("domenica");

        System.out.println(gio);


       System.out.println("Is the first Set equal to the second one?");



       //qua fai il confronto tra treeset e linked hash set
System.out.println(giorni.equals(gio));







    }
}
