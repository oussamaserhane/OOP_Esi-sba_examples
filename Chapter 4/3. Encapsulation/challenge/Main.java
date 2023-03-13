public class Main{
    public static void main(String []args){
        User user1 = new User("John", "Doe", 28, "ABC123"); // creating new user
        User user2 = new User("Jane", "Doe", 31, "ABC121");
        User user3 = new User("Shawn", "Doe", 27, "ABC122");
       
        System.out.println("User info -- Name: " + user1.getFirstName() + " " + user1.getLastName() + "; ID: " + user1.getUserID() + "; Age: " + user1.getAge());
        System.out.println("User info -- Name: " + user2.getFirstName() + " " + user2.getLastName() + "; ID: " + user2.getUserID() + "; Age: " + user2.getAge());
        System.out.println("User info -- Name: " + user3.getFirstName() + " " + user3.getLastName() + "; ID: " + user3.getUserID() + "; Age: " + user3.getAge());
       
        user1.setAge(29); // updating age through setter

        System.out.println("User info -- Name: " + user1.getFirstName() + " " + user1.getLastName() + "; ID: " + user1.getUserID() + "; Age: " + user1.getAge()); // checking update
    }
}