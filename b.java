//  class demo
// {
//     // int a=10;
//     // String b="abhi";
//     //  void show()
//     // {
//     //     System.out.println(a+""+b);
//     // }


//     // public static void main(String[] args) {
//     //     demo obj=new demo();
//     //     obj.show();

//     // }

// //constructor
//     int a;
//     String name;
//     // demo()//constructor
//     // {
//     //     a=0;
//     //     name=" abhijit";
//     // }
//     void show()
//     {
//         System.out.println(a+""+name);

//     }
// }
// class b
// {
//     public static void main(String[] args) {
//         demo obj=new demo();
//         obj.show();
//     }
// } 

//parameterized constructor
// class demo{
//     int x;
//     String y;
//     demo(int a, String b)//parameter
//     {
//         x=a;
//         y=b;
//     }
//     void show()
//     {
//         System.out.println(x+""+y);
//     }
// }
// class b
// {
//     public static void main(String[] args) {
//         demo obj=new demo(100,"name");
//         obj.show();
//     }
// }
//copy constructor
// class demo{
//     int a;
//     String b;
//     demo()
//     {
//         a=10;
//         b="hey in am coding";
//         System.out.println(a+""+b);
//     }
//     demo(demo ref)
//     {
//         a=ref.a;
//         b=ref.b;
//         System.out.println(a+""+b);
//     } 
// }
// class b
// {
//     public static void main(String[] args) {
//         demo obj=new demo();
//         demo obj2=new demo(obj);
        
//     }
// }
//private
// class b{
//      int a;
//      String b;
//      private b()
//      {
//          a=10;
//          b="hey in am coding";
//          System.out.println(a+""+b);
//     }

//     public static void main(String[] args) {
//          b obj=new b();
//     }
// }
//instance block
// class demo
// {   
//         int a,b;
//    static void show()
//     {                       //method
    
//         System.out.println("lets go");
//     }
    
//     demo()
//     {
//         a=30;           //constructor
//         b=40;
//         System.out.println(a+""+b);
    
//     }
//     {
//          a=40;              //instance block
//          b=60;
//          System.out.println(a+""+b);
//     }
// }
// class b
// {
// public static void main(String[] args) {
//     demo.show();
//     demo r=new demo();
//     // r.show();

// }

// }

//simple inheritence
// class demo
// {
//     int roll,marks;
//     String name;
// }
// class ankit extends demo
// {
//     void display()
//     {
//         roll=23;
//         marks=89;
//         name="ankit";
//         System.out.println(roll+" "+marks+" "+name);
//     }
// }
// class b
// {
//     public static void main(String[] args) {
//         ankit r=new ankit();
//         r.display();
//     }
// }
//multilevel inheritence
// class demo
// {
//     double a,b,c;
//     void add()
//     {
//         a=10;
//         b=54;
//         c=a+b;
//         System.out.println("sum="+c+"");
//     }

// }
// class sub extends demo
// {
    
//     void sub()
//     {
//         a=10;
//         b=54;
//         c=a-b;
//         System.out.println("sum="+c+"");
//     }

// }
// class mul extends sub
// {
    
//     void mul()
//     {
//         a=10;
//         b=54;
//         c=a*b;
//         System.out.println("sum="+c+"");
//     }

// }
// class div extends mul
// {
   
//     void div()
//     {
//         a=10;
//         b=54;
//         c=a/b;
//         System.out.println("sum="+c+"");
//     }

// }
// class b{
//     public static void main(String[] args) {
//        div r=new div();
//         r.add();r.sub();r.mul();r.div();
//     }
// }
//hiarchical inheritence
// class demo
// {
//      void name(){
//         System.out.println("enter my name");
//      }
// }
// class sum extends demo
// {
//  void ram(){
//         System.out.println("My name is ram");
//      }   
// }
// class mul extends demo
// {
//     void abhi(){
//         System.out.println("my name is abhijit");
//      }
// }
// class b
// {
//     public static void main(String[] args) {
//         sum ram1=new sum();
//         mul abhi=new mul();
//         ram1.ram();ram1.name();
//         abhi.abhi();abhi.name();

//     }
// }
//this keyword 
// class b{
//     void show()
//     {
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//         b r=new b();
//         System.out.println(r);
//         r.show();
//     }
// }
// class b{
//     int a;
//     b(int a)
//     {
//         this.a=a;
//     }
//     void show()
//     {
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         b r=new b(100);
//         r.show();
//     }
// }
// class b{
//     int a;
//     b()
//     {
//         System.out.println("coder");
//     }
//     b(int a)
//     {
//         this();
//         System.out.println(a);
//     }
    
//     public static void main(String[] args) {
//         b r=new b(100);
        
//     }
// }
// class b{
//     int a;
//     b()
//     {
//         this(100);
//     }
//     b(int a)
//     {
    
//         System.out.println(a);
//     }
    
//     public static void main(String[] args) {
//         b r=new b(100);
        
//     }
// }
//polymorphism//method overloading
// class b
// {
//     void add()
//     {
//         int a=10,b=45,c;
//         c=a+b;
//         System.out.println(c);
//     }
//     void add(int x,int y)
//     {   int c;
//         c=x+y;
//         System.out.println(c);
//     }
//     void add(int x,double z)
//     {
//         double c;
//         c=x+z;
//         System.out.println(c);
//     }
//     public static void main(String[] args) {
//         b r=new b();
//         r.add();
//         r.add(100,78);
//         r.add(10,67.9);
//     }
// }
//method overriding
// class demo{
//     void draw()
//     {
//         System.out.println("can,t not determine the shape");
//     }
// }
// class shape extends demo
// {
//     @Override
//     void draw()
//     {
//      //  super.draw();        //use of super keyword to acccess the super class.
//         System.out.println("square shape");
//     }
// }
// class b{
//     public static void main(String[] args) {
//         shape r=new shape();
//         r.draw();
//     }
// }
//ENCAPSULATION
// class demo{
//     private int value;//data bhiding
//     public void setValue(int x)//data abstraction
//     {
//         value =x;
//     }
//     public int getvalue()
//     {
//         return value;
//     }
// }
// class b
// {
//     public static void main(String[] args) {
//         demo r=new demo();
//         r.setValue(100);
//         System.out.println(r.getvalue());
//     }
// }
//abstraction
// abstract class animal
// {
//     public abstract void sound();
    
// }
// class dog extends animal{
//     public void sound()
//     {
//         System.out.println("dog barks");
//     }
// }
// class tiger extends animal{
//     public void sound()
//     {
//         System.out.println("tiger roars");
//     }
// }
// class b{
//     public static void main(String[] args) {
//         dog r=new dog();
//         tiger r1=new tiger();
//         r.sound();
//         r1.sound();

//     }
// }
//abstract method
// abstract class progam
// {
//     public abstract void coder();
// }
// class html extends progam
// {
//     @Override
//      public void coder()
//     {
//         System.out.println("abhijit");
//     }
// }
// class java extends progam
// {
//     @Override
//      public void coder()
//     {
//         System.out.println("ram");
//     }
// }
// class b
// {
//     public static void main(String[] args) {
//         html r=new html();
//         java r1=new java();
//         r.coder();
//         r1.coder();
//     }
// }
//interface
// import java.util.*;
// interface client
// {
//     void input();//public+abstract
//     void output();
// }
// class b implements client
// {
//     String name;
//     double sal;
//    public void input()
//     {
//         Scanner r=new Scanner(System.in);
//         System.out.println("Enter Your name");
//         name=r.nextLine();
//         System.out.println("Enter Your salary");
//         sal=r.nextDouble();

//     }
//     public void output()
//     {
//         System.out.println(name+" "+sal);

//     }
//     public static void main(String[] args) {
//         client r1=new b();
//         r1.input();
//         r1.output();

//     }
// }
//multipe inheritence
// interface demo
// {
//     void show();
// }
// interface demo1
// {
//     void show();
// }
// class b implements demo,demo1
// {
//     public void show()
//     {
//         System.out.println("Interface A&B");
//     }
//     public static void main(String[] args) {
//         b r=new b();
//         r.show();
//     }
// }
//exception
// class b{
//     public static void main(String[] args) {
//         System.out.println("start");
//         int a,b,c;
//         a=10;
//         b=0;
//         try{
//         c=a/b;
//         System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("end");
//         }
//     }
//multiple try catch block
// class b{

//     public static void main(String[] args) {
//         try{
//             int a=10,b=9,c;
//             c=a/b;
//             System.out.println(c);
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//         try{
//             int a[]={2,4,6,7};
//             System.out.println(a[5]);
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }

//     }
// }
//multipe catch block
// class b{

//     public static void main(String[] args) {
//         try{
//             int a=10,b=1,c;
//             c=a/b;
//             System.out.println(c);
//             int arr[]={2,4,6,7};
//             System.out.println(arr[5]);
//             String str=null;
//             System.out.println(str.toUpperCase());
//         }
//         catch(ArrayIndexOutOfBoundsException c)
//         {
//             System.out.println("array index is not valid");
//         }
//         catch(ArithmeticException a)
//         {
//             System.out.println("arithemtic exception");
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }

//     }
// }
//nested try block
// class b{

//     public static void main(String[] args) {
//         try{
//             int a=10,b=0,c;
//             c=a/b;
//             System.out.println(c);
//              try
//              {int arr[]={2,4,6,7};
//             System.out.println(arr[3]);
//                 }
//             catch(ArrayIndexOutOfBoundsException e)
//             {
//             System.out.println("array index is not valid");
//             }
//         }
//         catch(ArithmeticException a)
//         {
//             System.out.println("arithemtic exception");
//         }
//        System.out.println("end");

//     }
// }
//nested finally block
// class b{

//     public static void main(String[] args) {
//         try{
//             int a=10,b=9,c;
//             c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("arithematic error");
//         }
//         finally{
//             try{
//                       System.out.println(10/0);

//             }
//             catch(ArithmeticException r)
//             {
//                 System.out.println(r);
//             }
//             finally{
//                 System.out.println("hello");
//             }
          
//         }
//     }
// }

}
//extending thread class
// class A extends Thread{
//     @Override
//     public void run(){
//        try{
//          for(int i=1;i<=5;i++)
//         {
//             System.out.println("abhijit");
//             Thread.sleep(1000);
//         }
//     }
//         catch (Exception e) {
//             System.out.println("e");
//         }
       
//     }

// }
// class b{
//     public static void main(String[] args) throws InterruptedException{
//         A r=new A();
//         r.start();
//          for(int i=1;i<=5;i++)
//         {
//             System.out.println("abhi");
//             Thread.sleep(1000);
//         }
//     }
// }
//implementing runnable interface
// class A implements  Runnable{
    
//     public void run(){
//        try{
//          for(int i=1;i<=5;i++)
//         {
//             System.out.println("abhijit");
//             Thread.sleep(1000);
//         }
//     }
//         catch (Exception e) {
//             System.out.println("e");
//         }
       
//     }

// }
// class b{
//     public static void main(String[] args) throws InterruptedException{
//         A r=new A();
//         Thread t=new Thread(r);
//         t.start();
//          for(int i=1;i<=5;i++)
//         {
//             System.out.println("abhi");
//             Thread.sleep(1000);
//         }
//     }
// }
//join method
// class A extends Thread{
    
//     public void run(){
//        String name=Thread.currentThread().getName();
//          for(int i=1;i<=3;i++)
//         {
//             System.out.println(name);
            
//         } 
//     }

// }
// class b{
//     public static void main(String[] args) {
//         A r1=new A();
//         A r2=new A();
//         A r3=new A();
       
//         r1.setName("abhijit");
//         r2.setName("abhi");
//         r3.setName("abhijit mondal");

        
//         r2.start();
//         try {
//              r2.join();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//        r1.start();
//         r3.start();
//          System.out.println("fggj");
//     }
// }
//stop& isAlive
// class A extends Thread{
    
//     public void run(){
//        String name=Thread.currentThread().getName();
//          for(int i=1;i<=3;i++)
//         {
//             System.out.println(name);
            
//         } 
//     }

// }
// class b{
//     public static void main(String[] args) {
//         A r1=new A();
//         A r2=new A();
//         A r3=new A();
       
//         r1.setName("abhijit");
//         r2.setName("abhi");
//         r3.setName("abhijit mondal");

        
       
//       // r1.start();
//        System.out.println(r1.isAlive());
//         r2.start();
//         r3.start();
//           //r2.stop();
          
//     }
// }
//priority
// class A extends Thread{
    
//     public void run(){
//        System.out.println(Thread.currentThread().getName());
//          System.out.println(Thread.currentThread().getPriority());
//     }

// }
// class b{
//     public static void main(String[] args) {
//         A r1=new A();
//         A r2=new A();
//         A r3=new A();
       
//         r1.setName("abhijit");
//         r2.setName("abhi");
//         r3.setName("abhijit mondal");
//         r1.setPriority(4);
//         r2.setPriority(7);
//         r3.setPriority(10);
//         r1.start();
//         r2.start();
//         r3.start();
         
          
//     }
// }
