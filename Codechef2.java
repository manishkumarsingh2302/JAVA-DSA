import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef2
{
    public static void main(String[] args) throws java.lang.Exception
    {
        long fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        
        for(int i=1;i<=no;i++){
            fact=fact*i;
}
            System.out.println("Factorial of :"+no +" is="+fact);
           // sc.close();
        }

    }
