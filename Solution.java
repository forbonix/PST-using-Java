import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}

public class Solution 
{

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();

            List<Event> events = new ArrayList<>();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Read input
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");

                String name = parts[0];
                LocalDate date = LocalDate.parse(parts[1], formatter);

                events.add(new Event(name, date));
            }

            int month = sc.nextInt();

            events.sort(Comparator.comparing(e -> e.date));

            for (Event e : events) {
                System.out.print(e.name + " ");
            }
            System.out.println();

            System.out.println(events.get(0).name);

            System.out.println(events.get(events.size() - 1).name);

            for (Event e : events) {
                if (e.date.getMonthValue() == month) {
                    System.out.print(e.name + " ");
                }
            }
        }
    }
}
