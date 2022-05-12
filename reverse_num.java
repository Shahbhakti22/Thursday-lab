import java.util.Scanner;

public class reverse_num {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        int reversenum=0;
        System.out.println("enter a num:");
        num=sc.nextInt();
        while (num!=0)
        {
            reversenum=reversenum*10;
            reversenum=reversenum+num%10;
            num=num/10;
        }
        System.out.println("reverse of number:"+reversenum);
    }
}
