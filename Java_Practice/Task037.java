class Employee{
    private int pwd;
    protected int salary;
    public int empid;
    Employee(){   //  constructor
        System.out.println("Employee  Details");


    }
}
class Hr extends Employee { //sub class inherites from employee
    Hr() {
        //super.pwd = 1234; // error : as it is a private access
        super.salary = 50000;
        super.empid = 10001;
    }
    public  void display() { // method to diplay
       // System.out.println("password :" + pwd); //
        System.out.println("Salary :" +salary);
        System.out.println("employee ID :" + empid);

    }

    public static void main(String[] args) {
        Hr obj = new Hr();
        obj.display();// displays
    }
}