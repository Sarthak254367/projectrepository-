public class Main7 {
    public static void main(String[] args) {
        int marks[] ={6,7,8,9,67};
     //changing the array
     change(marks);
System.out.println(marks[0]);
    
        foo();
        foo(a:30000);
    }



static void change(int arr[]) {
   arr[0]=98;

}
//what is the logic behind this
//refrencing a object of marks
//method overloading

static void foo() {
    System.out.println("good morning bro");
}
static void foo(int a) {
    System.out.println("good morning bro");
}






}