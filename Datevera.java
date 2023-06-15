package co.develhope.introduction;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Datevera
{
    public static void main(String[] args) {


    /*    Date now = new Date();
        LocalDate we=LocalDate.of(2023,Month.JUNE,1).
        System.out.println(now);
*/

        int giornirimanentifinedellanno = LocalDate.now().lengthOfYear() - LocalDate.now().getDayOfYear();


        int giornirimanentifinedelmese = LocalDate.now().lengthOfMonth() - LocalDate.now().getDayOfMonth();



        System.out.println("giorni rimanenti fine del mese "+ giornirimanentifinedelmese);
        System.out.println("giorni rimanenti fine del mese "+ giornirimanentifinedellanno);


    }}





