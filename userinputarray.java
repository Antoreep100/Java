import java.util.*;  //this give access to Scanner but it has all utility
public class Main{                    //This defines a class named Main, which is the entry point of the Java program.
    public static void main(String[] args)
    {
        int [] myList = new int[5];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter " + myList.length +" integer value: ");
        for (int i =0;i<myList.length;i++)
        {
            myList[i] = input.nextInt();
        }
         System.out.println("Array: " + Arrays.toString(myList));
    }
}
