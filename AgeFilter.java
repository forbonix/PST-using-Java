import java.util.*;
import java.util.stream.*;

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Static method for filtering
    public static boolean isOlderThan(Person p, int ageLimit) {
        return p.getAge() > ageLimit;
    }
}

public class AgeFilter {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();

            List<Person> persons = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int age = sc.nextInt();
                persons.add(new Person(name, age));
            }

            int ageLimit = sc.nextInt();

            // 1️⃣ Sort alphabetically using method reference
            List<Person> sortedList = persons.stream()
                    .sorted(Comparator.comparing(Person::getName))
                    .collect(Collectors.toList());

            sortedList.forEach(p -> System.out.print(p.getName() + " "));
            System.out.println();

            // 2️⃣ Filter using static method reference
            persons.stream()
                    .filter(p -> Person.isOlderThan(p, ageLimit))
                    .forEach(p -> System.out.print(p.getName() + " "));
            System.out.println();

            // 3️⃣ Convert to uppercase using instance method reference
            persons.stream()
                    .map(Person::getName)
                    .map(String::toUpperCase)
                    .forEach(name -> System.out.print(name + " "));
        }
    }
}
