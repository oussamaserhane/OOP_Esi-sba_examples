class Rectangle extends Shape {
   double length;
   double width;
   public Rectangle(double length, double width){
      this.length = length;
      this.width = width;
   } 
   //implementation of abstract method
   public double area(){
      return length * width;
   }
}
