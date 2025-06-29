class Base1{

    int x;
   Base1(){
    System.out.println("I am base class constructor");
   }
   
Base1(int a){
    System.err.println("I ama aconstructor with valur as"+a);
}




    public void setX(int x) {
        System.out.println("I am setting x now in base class");
        this.x = x;
    }
    public int getX() {
        return x;
    }

    
}

    class Derived1 extends Base1{   //all properties of base come in derived  class
    int y;
  
    Derived1(){
         super(0); //calling an constructor with an argument when we not use that it prints the default constructor
        System.out.println("I am a derived constuctor");
    }

    Derived1(int x,int y){
        
        System.out.println("the value of constructoe wuth value y " +y);
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    

}


public class oops3 {
  public static void main(String[] args) {
    Base1 b=new Base1();
    // Derived1  d=new Derived1();  // the constrictor of the base class is executed than thr derived class
    Derived1  d=new Derived1(14,15);
    
  }
}
