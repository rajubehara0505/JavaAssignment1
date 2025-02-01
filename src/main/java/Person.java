import java.util.Optional;

public class Person {
    // Attributes to store person's name, age, and their dog
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    // Constructor to initialize person without a dog, reuses the other constructor
    public Person(String name, Integer age) {
        this(name, age, null);
    }

    // Main constructor to initialize all fields including dog as optional
    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    // Method to check if the person's dog is old without using a direct if-statement
    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    // Method to change the dog's name or throw an exception if the person doesn't have a dog
    public void changeDogsName(String newName) {
        dog.ifPresentOrElse(
            d -> d.setName(newName),
            () -> { throw new RuntimeException(name + " does not own a dog!"); }
        );
    }
}
