import java.util.ArrayList;
  public class Challenge3 {
    public static void main(String[] args){
  ArrayList<String>  color = new ArrayList<String>();

  color.add("Red");
  color.add("Green");

  System.out.println("Original array list: " + color);
  String new_color = "White";
  color.set(1,new_color);

  int num=color.size();
  System.out.println("Replace second element with 'White'."); 
  for(int i=0;i<num;i++)
  System.out.println(color.get(i));
  }
}