class EkClass{
    int a;
    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a=v;
    }

    public int returnnONE(){
        return 1;
    }
}

public class oops4 {
    public static void main(String[] args) {
        EkClass e=new EkClass(5);
        System.out.println(e.getA());
    }
}
