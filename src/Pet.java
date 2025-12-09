public class Pet {
    private String name; //can't then go bella.name = "Jim"
    private final String specie;
    private int age;

    //constructors
    public Pet(String name, String specie, int age) {
        this.name = name;
        this.specie = specie;
        this.age = age; // all ages must be positive

    }


    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }


    public void makeSound() {
        IO.println("Humph!");
    }

    public void celebrateBirthday() {
        age++;
        IO.println("age is now " + age);
    }



}
