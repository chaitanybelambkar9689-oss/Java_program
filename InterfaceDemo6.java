interface A
{
    int no=11;
    void fun();

}
interface B
{
    int no=21;
    void gun();
}
class Demo implements A,B //multiple inheritance
{
 public void fun()
 {
    System.out.println("inside fun"+no);//no generate error
 }
 
}
class InterfaceDemo6
{
    public static void main()
    {
       Demo dobj =new Demo();
       dobj.fun();
     

    }
}