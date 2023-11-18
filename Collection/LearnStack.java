import java.util.Stack;
public class LearnStack {
   public static void main(String args[]){
 Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Elphant");
        animal.push("crocodile");
        // System.out.println("Stack :" +animal);
        // System.out.println(animal.peek());
        // animal.pop();
        // System.out.println(animal);
        System.out.println(animal.isEmpty());
   }
}
