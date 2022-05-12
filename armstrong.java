import java.util.Scanner;

public class armstrong {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,num1,r,s=0;
        System.out.println("enter a number:");
        num=sc.nextInt();

        num1=num;

        do {
            r=num%10;
            s=s+r*r*r;
            num=num/10;

        }while (num>0);
        {
            if (num1==s)
            {
                System.out.println("it is an armstrong no");
            }else
            {
                System.out.println("it is not an armstrong");
            }
        }

    }
}
