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

        Dog bella = new Dog("Bella", 10, "Brown", "Mongrel");
        bella.setName("Fred");
        //bella.setAge(5); //can't change age as setAge is private. All good.

        IO.println("Name = " + bella.getName());
        IO.println("Specie = " + bella.getSpecie());
        IO.println("Age = " + bella.getAge());

        bella.makeSound();
        bella.celebrateBirthday();




    }
}
