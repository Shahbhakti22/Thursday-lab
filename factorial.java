//WAP to accept a no from user and find out the factorial


import java.util.Scanner;

public class factorial {

    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int p=1;
        System.out.println("enter a number:");
        int n= sc.nextInt();

        for (int i=1;i<=n;i++)
        {
            p=p*i;
        }
        System.out.println("Factorial:" +p);
    }

}
