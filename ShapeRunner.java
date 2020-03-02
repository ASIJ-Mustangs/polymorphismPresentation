public class ShapeRunner {
   public static void main(String[] args) {
      Object one = new Circle(50, 40, 10.5);
      Object two = new Shape(50, 40);
      Shape three = new Circle(50, 40, 10.5);
      Shape four = new Shape(50, 40);
      Circle five = new Circle(50, 40, 10.5);
      
      
      // one
      System.out.println(one.equals(three));
      System.out.println(((Shape)one).getX());
      System.out.println(((Circle)one).getX());
      System.out.println(((Shape)one).getY());
      System.out.println(((Shape)one).getArea());
        // uncomment line below to see a compile-time error
      //System.out.println(((Shape)one).getRadius());
      System.out.println(((Circle)one).getRadius());
      
      
      // two
      System.out.println(two.equals(four));
      System.out.println(((Shape)two).getX());
        // uncomment line below to see a run-time error
      //System.out.println(((Circle)two).getX());
      System.out.println(((Shape)two).getY());
      System.out.println(((Shape)two).getArea()); 
        // uncomment line below to see a compile-time error
      //System.out.println(((Shape)two).getRadius());
        // uncomment line below to see a run-time error
      //System.out.println(((Circle)two).getRadius());
      
      
      // three
      System.out.println(three.equals(five));
      System.out.println(((Shape)three).getX());
      System.out.println(((Circle)three).getX());
      System.out.println(((Shape)three).getY());
      System.out.println(((Shape)three).getArea());
        // uncomment line below to see a compile-time error 
      //System.out.println(((Shape)three).getRadius());
      System.out.println(((Circle)three).getRadius());
      
      
      // four
      System.out.println(four.equals(two));
      System.out.println(((Shape)four).getX());
        // uncomment line below to see a run-time error
      //System.out.println(((Circle)four).getX());
      System.out.println(((Shape)four).getY());
      System.out.println(((Shape)four).getArea());
        // uncomment line below to see a compile-time error 
      //System.out.println(((Shape)four).getRadius());
        // uncomment line below to see a run-time error
      //System.out.println(((Circle)four).getRadius());
      
      
      // five
      System.out.println(five.equals(three));
      System.out.println(((Shape)five).getX());
      System.out.println(((Circle)five).getX());
      System.out.println(((Shape)five).getY());
      System.out.println(((Shape)five).getArea());
        // uncomment line below to see a compile-time error 
      //System.out.println(((Shape)five).getRadius());
      System.out.println(((Circle)five).getRadius());
   }
}