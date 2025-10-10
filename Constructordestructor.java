class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("inside default constructor");

    }
    public Demo(int i,int j)
    {
        System.out.println("inside parametrised constructor");


    }
    protected void finalize() //~Demo()
    {
        System.out.println("Inside finalize");
    }


}
class Constructordestructor
{
    public static void main(String Arg[])
    {
        Demo dobj1 = new Demo();//1(); Demo dobj syntax of c++
        Demo dobj2 = new Demo(11,21);//Demo dobj2(11,21);
        
        dobj1 = null;
        dobj2 = null;
        System.gc();//garbage collector=gc
        System.out.println("End of main");

    }    

}