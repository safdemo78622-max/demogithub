import java.util.*;
class Basic 
{
    int age;
    double basic;
    Basic(int age ,double basic )
    {
        this.age= age;
        this.basic  = basic;
    }
    void inc()
    {
        if(age>56)
            basic+=basic*0.2;
        else if(age<=56 && age>45)
            basic+=basic*0.15;
        else
            basic+=basic*0.1;
    }
    
    void display()
    {
        System.out.println("Age: " + age);
        System.out.println("Basic: " + basic);

    }
    void display(String name)
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic: " + basic);  
    }

    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the name ");
        String name=in.nextLine();
        System.out.println("Enter the age and basic salary ");
        int x= in.nextInt();
        double y=in.nextDouble();
        Basic b=new Basic(x,y);
        b.inc();
        b.display();
        b.display(name);
        in.close();
        


    }
}