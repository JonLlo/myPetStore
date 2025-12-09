import java.util.ArrayList;

public class Cat extends Pet{
    private String colour;
    private final String breed;

    public Cat(String name, int age, String colour, String breed) {
        super(name, "Cat", age);
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
    @Override //“I am replacing a method from the parent." just lets you know.
    public void makeSound() {
        //will override method in pet
        super.makeSound(); //super - using the makesound from the original method
        IO.println("and also goes meow!");
    }

}

//overriding vs overloading
//upcasting and downcasting
