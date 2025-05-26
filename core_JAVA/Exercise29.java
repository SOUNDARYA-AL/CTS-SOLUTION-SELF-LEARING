Records:

record Person(String name, int age) {}
public class RecordDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("John", 20), new Person("Jane", 15));
        people.stream().filter(p -> p.age() > 18).forEach(System.out::println);
    }
}