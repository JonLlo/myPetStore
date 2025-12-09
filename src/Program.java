import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    //9th Dec
    static void main() {
        // Procedural
        /*
        String name = "Bella";
        String specie = "Dog";
        int age = 3;
*/

        //OOP

        int age = -1;
        Scanner reader = new Scanner(System.in);

        while (age < 0) {
            IO.print("Enter age: ");
            try {
                age = reader.nextInt();
            } catch (Exception e) {
                IO.println("Number not recognised.");
                reader.nextLine(); //this clears the leftover bad input after a failed nextInt() call.
            }
        }

        Dog bella = new Dog("Bella", age, "Brown", "Mongrel");
        bella.setName("Fred");
        //bella.setAge(5); //can't change age as setAge is private. All good.

        IO.println("Name = " + bella.getName());
        IO.println("Specie = " + bella.getSpecie());
        IO.println("Age = " + bella.getAge());

        bella.makeSound();
        bella.celebrateBirthday();

        //UPCASTING - Pet = new Dog
        Pet fido = new Dog("Fido", 4, "Black and white", "Border Collie");
        fido.makeSound();
        fido.celebrateBirthday();

        //DOWNCASTING - Dog = new Pet
        //Dog a = new Pet("A", "Dog", 6); Don't do it!
        //arraylists:

        ArrayList<Pet> petList = new ArrayList<>();
        Cat felix = new Cat("Felix", 12, "Black and white", "Moggy");
        petList.add(bella);
        petList.add(fido);
        petList.add(felix);

        for (Pet p : petList) {
            p.makeSound();
        }





    }
}
