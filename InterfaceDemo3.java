
interface Demo
{
  int No =11; //public static final
  void Display();
}
abstract class Hello implements Demo
{
    public void Display()
    {
        System.out.println("Inside Display");
    }
    

}
class InterfaceDemo3
{
    public static void main(String A[])
    {
        System.out.println(Demo.no);
        Hello hobj =new Hello(); //error
        hobj.Display();
    }
}