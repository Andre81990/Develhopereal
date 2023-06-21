package co.develhope.introduction.co.develhope.introduction;

public class Employee {

//3 var
    public String name;
    public String  surname;
    public String  address;


    //costruttore

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
    name=newEmployeeName;
    surname=newEmployeeSurname;
    address=newEmployeeAddress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private static int totalNumberOfEmployees;


    //dettagli impiegati



    public String getEmployeeDetails()
    {



        //tostring
        return " il nome corrisponde a " +name+ ", il cognome è "
                +surname+" e abita in "
                +address;
    }
}
