public interface IAnimalActions {
    void sleep(); //must implement

    default void makeSound(){ //may implement
        IO.println("Humph!");
    };

    static void identify() { //can't implement
        IO.println("I identify as an animal!");

    }

    static void printAnimal(Dog dog) {
        IO.println("Name is " + dog.getName());

    }


}
