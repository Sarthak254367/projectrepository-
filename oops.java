class Employee{
        // int id;
        // String name;
     private int id;
     private String name;

public String getName(){
        return name;
     }

   public void setName(String n){
        name=n;
     }
  

     public int getId(){
        return id;
     }

   public void setId(int b){
        id=b;
     }


    //creating to print details avoid many lines of code
        public void printDetails(){
            System.out.println("My id is "+ id);
            System.out.println("My name is " +name);
        }
    }

public class oops {
        public static void main(String[] args) {
           Employee Sarthak=new Employee();//intitiating an object
        //    Sarthak.id=90;//setting an atributes 
        //    Sarthak.name="Code with sarthak";
           Sarthak.setName("code with sarthak");
           System.out.println(Sarthak.getName());
        
    }
}
