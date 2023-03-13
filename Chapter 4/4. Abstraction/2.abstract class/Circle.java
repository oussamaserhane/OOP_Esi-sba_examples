class Circle extends Shape {
   double radius;
   public Circle(double radius){
      this.radius = radius;
   }
   //implementation of abstract method
   public double area(){
      return Math.PI * radius * radius;
   }
}


