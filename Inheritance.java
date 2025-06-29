class Base{
    int x;
    public void setX(int x) {
        System.out.println("I am setting x now in base class");
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void printMe(){
System.out.println("i am a base constructor");
    }
}
class Derived extends Base{   //all properties of base come in derived  class
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    

}
public class Inheritance {
 public static void main(String[] args) {
    //understanding about inheritance 
    // Base b=new Base();
    Derived b=new Derived();    //printing the same result as i am creating a new derives object which contain base class attributes 
    b.setX(8);
    System.out.println(b.getX());

    //can we excess the y in the base class 
    //No we cannot access this as the y is in derived class only 
 }
}
