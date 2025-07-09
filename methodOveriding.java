class A{
    public int a;
    public int Sarthak(){
        return 5;
    }

    public void meth2(){
        System.out.println("I am method of class A");
    }
}

class B extends A{
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }

     public void meth2(){
        System.out.println("I am method 2 of class B");  //method overiding
    }
}


public class methodOveriding {
    public static void main(String[] args) {
       A a=new A();
       a.meth2(); //calling method2 from A
       
       B b=new B();
       b.meth2();
    }
}
