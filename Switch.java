package co.develhope.introduction;

import java.util.Scanner;

public class Switch


{


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int input=23;

        System.out.println("inserisci un num da 1 a 10 :");




        switch (input)
        {
        case 1:
            System.out.println("uno");
                    break;

            case 2:
                System.out.println("due");
                break;

            case 3:
                System.out.println("tre");
                break;

            case 4:
                System.out.println("quattro");
                break;

            case 5:
                System.out.println("cinque");
                break;

            case 6:
                System.out.println("sei");
                break;

            case 7:
                System.out.println("sette");
                break;

            case 8:
                System.out.println("otto");
                break;

            case 9:
                System.out.println("nove");
                break;
            default:
           System.out.println("Cannot give you the name");
        }
    }

}
