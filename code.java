import java.util.*;
public class diamond
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        diamond(n);
    }
    public static void diamond(int n)
    {
        //1st Part
        for(int i=1;i<=n;i++)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.println(" hi");
                System.out.print("Welcome to Java!!");
            }
            //stars
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        //2nd Part
        for(int i=n;i>=1;i--)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        
        //3rd Part
        {
            //Lets use StringBuffer
            Stringbuffer str = new StringBuffer("Java is Object Language");
            
            System.out.println("Original String was:  " + str);
            System.out.println("Length of the String is:  " + str.length());
        }
        
    }
}
