public class Main {
   public static void main(String[] args) {
      Shape circle = new Circle(5);
      Shape rectangle = new Rectangle(3, 4);
      
      circle.display();
      System.out.println("Area of circle: " + circle.area());
      
      rectangle.display();
      System.out.println("Area of rectangle: " + rectangle.area());
   }
}