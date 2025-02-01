public class Main {
    public static void main(String[] args) {
        // Creating a person without a dog
        Person person = new Person("John", 25);

        // Attempting to change the dog's name
        try {
            person.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
