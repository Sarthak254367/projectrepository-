class A{
    protected int num;
     public void setNum(int num) {
        this.num = num;
    }
     public int getNum() {
        return num;
    }
     String name;
    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }
    //we want to do few thing
    //access the data nenebers and modify the data memebers

    
}

public class B extends A{
        public B(int num,String name){
            super(num, name);
        }
}



public class modifiers {
    public static void main(String[] args) {
        A a=new A(5, "Sarthak");
        B b=new B(45,   "Kunal");
   int n=b.num;

    }
}
  
