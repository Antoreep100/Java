import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner scanner =new Scanner(System.in) ;
      String message= "Hello World" +"!!";
      System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf('o'));
          System.out.println(message.replace("!!" ,"**"));
          System.out.println(message);
    }
}
