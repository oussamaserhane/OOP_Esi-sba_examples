class User { 
    private String firstName; // private data
    private String lastName;
    private int age;
    public String userID; // assuming IDs can be public
 
    User (String firstName, String lastName, int age, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userID = userID;
    }
 
      // Getter function
      public String getFirstName() {
        return this.firstName;
      }
     
      // Getter function
      public String getLastName() {
        return this.lastName;
      }
     
      // Getter function
      public int getAge() {
        return this.age;
      }
     
      // Getter function
      public String getUserID() {
        return this.userID;
      }
     
      // Setter function
      public void setAge(int age) {
        this.age = age;
        System.out.println("User #" + this.userID + "'s age updated to " + age); // printing update information
      }
   
}