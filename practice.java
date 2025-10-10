// // // // // // class Base{
// // // // // //     public int i;
// // // // // //     public int j;
    
// // // // // //     public void fun()
// // // // // //     {
        
// // // // // //     }
// // // // // //     static public void gun()
// // // // // //     {

// // // // // //     }

    
// // // // // // }
// // // // // // class derived extends base
// // // // // // {
    
// // // // // //     public void fun()
// // // // // //     {

// // // // // //     }
// // // // // //     public void gun()
    
// // // // // //     {

// // // // // //     }

// // // // // // }
// // // // // // class practice
// // // // // // {
// // // // // //     public static void main(String A[])
// // // // // //     {
// // // // // //         Base bobj =new Base();
        
// // // // // //     }

// // // // // // 
// // // // // final class base
// // // // // {
// // // // //     public int i;
// // // // //     public int j;

// // // // //     public base()
// // // // //     {
// // // // //         this.i =20;
// // // // //         this.j 21;
// // // // //     }

// // // // // }
// // // // // class derived extends base{

// // // // // }
// // // // final class base
// // // // {
// // // //     public int i;
// // // //     public int j;
// // // //     public base()
// // // //     {
// // // //         this .i =10;
// // // //         this.j =12;
// // // //     }
// // // //     public void fun()
// // // //     {

// // // //     }


    

// // // // }
// // // // class derived 
// // // // {
// // // //     public base bobj;
// // // //     public derived()
 
// // // //     {
// // // //        bobj= new base();
// // // //     }
    
// // // // }
// // // // class practice
// // // // {
// // // //     public static void main(String A[])
// // // //    { derived dobj =new drived();
  
// // // //     dobj.bobj.fun();
// // // //    }

// // // // }

// // // class Base 
// // // {
// // //     public int i;
// // //     static public int j=11;
// // //     public Base()
// // //     {
// // //         this.i =11;
// // //     }
// // //     public void fun()
// // //     {
// // //         System.out.println("inside Base fun");
// // //         System.out.println("fun i"+bobj.i);
// // //         System.out.println("fun j "+Base.j);

// // //     }
// // //     static public void gun()
// // //     {
// // //         System.out.println("gun j"+Base.j);
// // //         System.out.println("gun i"+bobj.i);
// // //     }


// // // }
// // // class practice 
// // // {
// // //     public static void main(String A[])
// // //     {
// // //         Base bobj =new Base();
// // //         System.out.println(bobj.i);
// // //         System.out.println(Base.j);
// // //     }

// // // }
// // class base
// // {
// //     public int i;
// //     static public int j;

// //     static 
// //     {
// //         j =11;
// //         System.out.println("Inside  static block")
// //     }
// //     {
// //         System.out.println("inside initializer block")
// //     }
// //     public base ()
// //     {
// //       this .i =11;
// //       System.out.println("inside default constructor");
// //     }
// //     public base(int a)
// //     {
// //         system.out.println("Inside parametrised constructor");
// //     }
// // }
// // class practice
// // {
// //     base bobj1 =new base();
// //     base bobj2 =new base();
// //     base bobj3 = new base();
// //     base bobj4 = new base(11);

// // }
// class base 
// {
//     public int i;
//     public int j;
//     public void fun()
//     {
//         System.out.println("");
//     }
//     public void gun()
//     {

//     }
//     public void mun(){}
// }
// class derived extends base{
//     public int x;
//     public void mun()
//     {}
//     public void gun()
//     {}
// }
// class practice
// {
//     public static void main(String A[])
//     {
//         base bp =new derived();
//         derived dp =new derived();

//         base bp2 =new base();
//         derived dp2 =new derived(); 

//     }
// }
class base
{
    public int x;
    public int y;

    public base (int a,int b)
    {
        this.i = a;
        this.j = b;

    }
    public int addition(int a,int b)
    {
        return a+b;

    }
    abstract public int substraction(int a,int b);

    public int multiplication(int a,int b)
    {
        return a*b;
    } 
}
class derived extends base
{
    public static void main(String A[])
    {
        public int substraction(int a,int b)
        {
            return a+b;
        }


    }
}
class practice
{
    public static void main(String a[])
    {
        base bobj =new derived();
        int iRet =0;
        iRet = adition.bobj(11,21);
        System.out.println("Addition is "+iRet);
        iRet = substraction.bobj(11,21);
        System.out.println("substraction is"+iRet);
        iRet = Multiplication.bobj(11,21);
        System.out.println("Multiplication is"+iRet);



    }

}
