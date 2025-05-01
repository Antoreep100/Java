class Student {
String Name;
int Id;
int Age;
Student(String n,int i )
{
    Name=n;
    Id=i;
  
}
Student(String n,int i,int a )
{
    Name=n;
    Id=i;
    Age= a;
}
void display()
{
    System.out.println("Name: " + Name + "Id: " + Id  + " Age: " + Age);
}
   public  static void main(String args[])
    {
        Student obj1 =new Student("Alif ", 101 , 24);
        Student obj2 =new Student("biplob ", 102 );
        obj1.display();
        obj2.display();
    }
}
