class Demo{
    public int i;
    public static int j;
    static
    {
        j =21;
    }
    public Demo()
    {
        this.i =11;
        System.out.println("Inside Default");//first Use
        
    }
    
    public Demo(int a)
    {
        this();//this should be at the top //second Use
        System.out.println("Inside Parametrised");
    }
    public void Display()
    {
        System.out.println("Inside Display"+this.i); //Third Use
    }
}
class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj =new Demo(51);
        dobj.Display();
    }
}