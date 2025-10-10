class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("inside Hello constructor");
        this.i =no+1;
    }
}
class Demo extends Hello
{
    public int i;
    
    public Demo(int a)
    {
        super(a); //first use
        System.out.println("Inside Demo  constuctor");
        this.i =a;
        
    }
    
    
    public void Display()
    {
        int i=0;
        System.out.println("inside Display"+i);//0
        System.out.println("Inside Display"+this.i); //51
        System.out.println("inside Display"+super.i);//52//second Use
        super.Display(); //third Use
    }
}
class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj =new Demo(51);
        dobj.Display();
        
    }
}