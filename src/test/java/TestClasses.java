
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestClasses {
    // Test to verify that the Dog's age getter/setter are functioning correctly
    @Test
    public void testDogAge() {
        Dog dog = new Dog("Buddy", 9);
        assertEquals(9, dog.getAge());
    }

    // Test to check if hasOldDog returns true when the dog's age is 10 or more
    @Test
    public void testPersonHasOldDog() {
        Person person = new Person("John", 25, new Dog("Buddy", 10));
        assertTrue(person.hasOldDog());
    }

    // Test to ensure hasOldDog returns false when the dog's age is less than 10
    @Test
    public void testPersonDoesNotHaveOldDog() {
        Person person = new Person("John", 25, new Dog("Buddy", 9));
        assertFalse(person.hasOldDog());
    }

    // Test to verify changing a dog's name successfully when the dog exists
    @Test
    public void testChangeDogsNameWithDog() {
        Dog dog = new Dog("Buddy", 10);
        Person person = new Person("John", 25, dog);
        person.changeDogsName("Max");
        assertEquals("Max", dog.getName());
    }

    // Test expecting a RuntimeException when trying to change the name of a non-existent dog
    @Test
    public void testChangeDogsNameWithoutDog() {
        Person person = new Person("John", 25);
        assertThrows(RuntimeException.class, () -> person.changeDogsName("Max"));  // This should throw RuntimeException
    }
}
