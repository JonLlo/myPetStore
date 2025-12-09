public class Dog extends Pet{
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

    public void makeSound() {
        //will override method in pet
        IO.println("Woof!");
    }
}
