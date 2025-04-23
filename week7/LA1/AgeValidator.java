package week7.LA1;

public class AgeValidator {
    public static void validate(Person person) throws InvalidAgeException {
        int age = person.getAge();
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age entered: " + age);
        }
    }
}
