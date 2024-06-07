import java.util.Scanner;

interface client{
    void input(); //public abstract 
    void output();

}

class Raju implements client{
    String name; double sal;
    public void input()
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Username:");
        name = r.nextLine();
        System.out.println("Enter Salary :");
        sal = r.nextDouble();

    }
    public void output()
    {
        System.out.println(name+" "+sal);
}

public static void main(String[] args) {
    client obj = new Raju();
        obj.input();
        obj.output();
    }
    
}



    

