class Cylinder{
    private int radius;
   private int height;
 
    
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
  
   

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

public double getsurfaceArea(){
  return 2*3.14*radius*radius+ 2*3.14*radius*height;
 }
}

public class Constructo2 {
    

    public static void main(String[] args) {
  Cylinder c=new Cylinder();
    c.setHeight(13);
   System.out.println(c.getHeight());
   c.setRadius(14);
   System.out.println(c.getRadius());
   System.out.println(c.getsurfaceArea());
    }
}
