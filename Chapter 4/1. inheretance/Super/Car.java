class Car extends Vehicle {
    int maxSpeed = 180;
 
    // Method
    void display(){
        // Printing maxSpeed of parent class (vehicle) as
        // super keyword refers to parent class
        System.out.println("Maximum Speed: "
                           + super.maxSpeed);
    }
}




