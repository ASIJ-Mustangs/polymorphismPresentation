import java.util.ArrayList;

public class AnimalRunner {
   public static void main(String[] args) {
      ArrayList<Animal> list = new ArrayList<Animal>();
      list.add(new Dog("Hachikō"));
      list.add(new Cat("Maru"));
      list.add(new Capybaras("Kapibarasan"));
      for(int i = 0; i < list.size(); i++)
         System.out.println(list.get(i).speak());
   }
}
