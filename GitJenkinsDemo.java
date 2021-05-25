
import java.io.*;
public class GitJenkinsDemo
{
    public static void main(String[] args)
    {
        int rows=7;            
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++) 
            {
            System.out.print("*" + " ");
            } 
            System.out.println("");
            } 
            for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("New Branch");
    }
}
