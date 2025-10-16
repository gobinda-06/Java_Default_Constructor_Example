//Default Constructor
class Student 
{
    int id;
    String name;

     Student() 
    {
        id=101;
        name="Gobinda";
    
    }

    public static void main(String[] args)
    {
        Student s1= new Student();
        System.out.println("Id is: "+s1.id);
        System.out.println("Name is: "+s1.name);
    }

}
