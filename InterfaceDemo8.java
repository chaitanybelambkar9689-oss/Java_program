interface A
{
    int no=11;
    void fun();
    default void gun()
    {
        System.out.println("inside Gun");
    }

}

class Demo implements A
{
 public void fun()
 {
    System.out.println("inside fun");
 }
 
}
class InterfaceDemo8

{
    public static void main(String A[])
    {
       Demo dobj =new Demo();
       dobj.fun();
       dobj.gun();
     

    }
}