public class Circle extends Shape {
   private double radius;
   
   public Circle(int x, int y, double r) {
      super(x, y);
      radius = r;
   }
   
   public double getRadius() {
      return radius;
   }
   
   public double getArea() {
      return Math.PI * radius * radius; 
   }
}