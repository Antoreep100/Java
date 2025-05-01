import java.util.*;
public class Main{
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
