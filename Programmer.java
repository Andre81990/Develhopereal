package co.develhope.introduction.co.develhope.introduction;

public class Programmer
{


    public  String name="carmelo";
    public  int age=46;

    public  boolean wearGlasses=true;

public void drinkCoffe()
{
    System.out.println("Espresso is the secret!");

}

    public  void printDetails()
    {
        System.out.println(name +  " is a Age "+age +"yo programmer");
    }

 public  void hasGlasses()
    {

        System.out.println("Is "+ name +" wearing glasses?");

    }


    public static void main(String[] args) {
        Programmer p1=new Programmer();
        Programmer p2=new Programmer();


        p1.drinkCoffe();
        p1.printDetails();

p2.name="gianni";

        p2.printDetails();
        p2.hasGlasses();
    }
}
