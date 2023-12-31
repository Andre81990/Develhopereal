package co.develhope.introduction;

public class BooleanOperator {

    public static void main(String[] args) {
        /*
        *
        * [A]: 2 <= 2 && !true
[B]: !false && 3 > 2
[C]: considering that t=false and f=true: !(!t || f)
[D]: 6 > 6 ^ !(true && true)
        * */



        boolean t=true;
        boolean f=false;
        if (2 <= 2 && !true)
            System.out.println(f);
        else
            System.out.println(t);


        if (!false && 3 > 2)
            System.out.println(t);
        else
            System.out.println(f);


        if (!(!t || f))
            System.out.println(t);
        else
            System.out.println(f);


        if (6 > 6 ^ !(true && true))
            System.out.println(t);
        else
            System.out.println(f);

    }
}
