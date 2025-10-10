class Demo
{
    public int i;//instance variable
    static public int j;//class variable
    static
    {
        System.out.println("Inside Static Block");
        
        j=21;
    }
    public Demo()
    {
        this.i=11;
        System.out.println("Inside Constructor");
        
    }
    
}
class Blocks
{
    public static void main(String A[])
    {
     System.out.println("Inside main");
     Demo dobj1 =new Demo() ;
     Demo dobj2 =new Demo() ;
     Demo dobj3 =new Demo() ;
     
    }
}