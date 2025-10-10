class Demo
{
    public int i;//instance variable
    static public int j;//class variable
    static
    {
        System.out.println("Inside StaticBlock");
        
        j = 21;
    }
    {
        System.out.println("Inside initializer block");
    }
    public Demo()
    {
        this.i = 11;
        System.out.println("Inside  default Constructor");
        
    }
    public Demo(int a)
    {
        this.i = a;
        System.out.println("Inside parametrised Constructor");
        
    }
    
}
class BlocksX                           
{
    public static void main(String A[])
    {
     System.out.println("Inside main");
     Demo dobj1 =new Demo() ;
     Demo dobj2 =new Demo() ;
     Demo dobj3 =new Demo() ;
     Demo dobj4 =new Demo(11) ;
    }
}