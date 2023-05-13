public class Car implements Comparable<Car>{
    String name;
    int id;

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public int compareTo(Car comparedObject) {
       int resault = 0;
       if(this.id> comparedObject.id)  resault = 1;
       if(this.id< comparedObject.id)  resault = -1;
       if(this.id ==comparedObject.id)  resault = 0;
       return resault;  
    }
    @Override
    public String toString() {
        return this.name;
    }
}

