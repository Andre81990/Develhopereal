package co.develhope.introduction;

public class NumberOperation {
    /*
    *
    * Define a testing class where you: -. Define an int variable called a and initialise it with the value 15

Add 5 to a without repeating the a variable (e.g. a = a + 5 is not accepted)
Then subtract 4 to a without repeating the a variable
Assign the value of a to int b and increment b by one without using a or int b = b + 1
Check and prints if both the following statements are true: statement 1: check if b is an odd number statement 2: check if the result of (b multiplied for b + 1) is a multiple of 3
    *
    *
    *
    * */

    public static void main(String[] args) {

        int a = 15;
        a += 5;
        //a=a+5
        //a-=5;
        //a=a-5;
        System.out.println(" il primo num " + a);
        a -= 4;

        System.out.println(a);
        int b = a;
        b++;
        System.out.println(b);


// b e dispari
        //b*(b+1) multi di 3

//306
        //
        if (b*(b+1)/3==0) {
            System.out.println("non e multiplo");
        } else {
            System.out.println("e multiplo");
        }
    }
}

