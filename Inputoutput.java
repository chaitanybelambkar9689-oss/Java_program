import java.util.Scanner;//use the *replace by scanner include all thing

class Inputoutput
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 =0,No2 =0;
        int Ans = 0;

        
        System.out.println("enter first number:");
        No1 =sobj.nextInt();

        System.out.println("enter second number:");
        No2 =sobj.nextInt();
        
        Ans =No1+No2;

        System.out.println("Addition is:"+Ans);

    }
}