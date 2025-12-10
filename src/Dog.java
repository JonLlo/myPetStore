public class Dog extends Pet implements IFeedable, IAnimalActions {
    private String colour;
    private final String breed;

    public Dog(String name, int age, String colour, String breed) {
        super(name, "Dog", age);
        this.breed = breed;
        this.colour = colour;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void sleep() {
        IO.println("ZZZ!");

    }
/*
    @Override //“I am replacing a method from the parent." just lets you know.
    public void makeSound() {
        //will override method in pet
        super.makeSound(); //super - using the makesound from the original method
        IO.println("and also goes Woof!");
    }
*/

    public void eat() {
        IO.println("nom nom");
    }
}

//overriding vs overloading
//upcasting and downcasting
