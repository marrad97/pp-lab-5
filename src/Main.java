import company.beans.Person;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Jan Nowak", 30);
            System.out.println("Imie: " + person.getName() + ", Wiek: " + person.getAge());
        } catch (company.exceptions.InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}