public class Main {
    
    int logic(int x,int y) {
    int z;
    {
        
        if(x>y) {
            z=x+y;
        }
        else{
         z= (x+y) *5; 
        }
        return z;
    }
}
     public static void main(String[] args) {
        int a=5;
        int b=6;
        int c;
     Main obj=new Main();

        c= obj.logic(a, b);
        System.out.println(c);

    }
}