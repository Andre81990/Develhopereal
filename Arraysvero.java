package co.develhope.introduction;

public class Arraysvero
{




        public static void main(String[] args) {

        String[]  cars={"ferrari" , "audi","fiat","lambo","merced"};

        System.out.println(cars.length);
        System.out.println(cars[2]);





        String[]  carse={"ferrari" , "audi","fiat","lambo","merced"};




        String[] copyDentro = new String[5];


        System.arraycopy(carse, 0, copyDentro, 0, 5);

        for (String car:copyDentro
        ) {

            System.out.println(car +" ");

        }
/*
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);



        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        * */


    }
    }



