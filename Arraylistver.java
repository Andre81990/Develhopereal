package co.develhope.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistver

{

    public static void main(String[] args) {

        //  Stringarr[] a= new java.lang.String[]{ "rome", "londra", "C", "D" };


//lista non mutabile=array
        //lista mutabile = arraylist
        List<String> cityNames = Arrays.asList("rome", "londra", "Chieri");
        // List<String> cityNames =new ArrayList<>();


//cityNames.add("torino");

        // cityNames.get(0);
//cityNames.add("torino");


        cityNames.set(1, "Tegucigalpa");

        System.out.println(cityNames);


        System.out.println(cityNames.get(2));


//Tegucigalpa

        System.out.println("non si puo agg nulla perche e una lista immutabile");


        List<String> re = new ArrayList<>();
        re.add("Romolo ");
        re.add("Numa Pompilio");

        re.add("Tullo Ostilio ");
        re.add("Anco Marzio");
        re.add("Tarquinio Prisco");
        re.add("Servio Tullio");
        re.add("Tarquinio il Superbo");


        System.out.println(re);

        //conversione da arraylist a arr
        //Arrays.asList
        //String[] reArray = re.toArray(new String[0]);

     //   String[] kingsOfRomeArray = kingsOfRome.toArray(new String[kingsOfRome.size()]);
String[] reArray=re.toArray(new  String[re.size()]);
        System.out.println(Arrays.toString(reArray));

reArray[6]="Lucius Tarquinius Supercar";

System.out.println(Arrays.toString(reArray));


    }

    }




