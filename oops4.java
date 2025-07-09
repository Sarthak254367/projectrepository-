class Shape{
    void area(){
        System.out.println("I am in shapes");
    }

}

class Circle extends Shape{
    @Override 
    //this will run when the object of circle is created and hence it us overriding thr parent class
 void area(){
        System.out.println("I am in Circle");
    }
}


class Square extends Shape{
     void area(){
        System.out.println("I am in Square");
    }
}

class Bank{
    private String name="sarthak";
    public String getName() {
        return name;                    //here we using enscaptulation hiding the name and balance and ia am using getter for 
    }                                    //getting my name in the bank class itself
                                        
    private int balance=90;
    public int getBalance() {
        return balance;
    }
}



public class oops4{
   public static void main(String[] args) {
    
        Shape s=new Shape();
        Shape c=new Circle();
        Shape sq=new Square();
        c.area();
        sq.area(); //calling area method in multiple ways this is polymorphism
        Bank b=new Bank();
        b.getName();
        System.out.println(b.getName());
    }
}

 