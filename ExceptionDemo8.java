import java.util.*;

class ExceptionDemo8
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);
        int iNo1 =0 , iNo2=0 ;
        int iAns =0;

        System.out.println("Enter first Number");
        iNo1 =sobj.nextInt();

        System.out.println("Enter Second Number");
        iNo2 =sobj.nextInt();
        try
        {
            iAns =iNo1/iNo2;
            System.out.println("inside try block");
        }
       
       
        catch(ArithmeticException aobj)//Specific Catch=kahihi pakadnara
        {
         System.out.println("inside catch block");
         System.out.println(aobj);
        }
        catch(Exception eobj)//generic catch
        {
            System.out.println("Inside generic catch");
        } 
        finally
        {
            System.out.println("Inside finally Block");
        } 
    
        System.out.println("Enter the division is:"+iAns);  


    }
}