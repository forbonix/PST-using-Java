import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Read input size
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            
            int secondHighest = list.stream()
                    .distinct()                         
                    .sorted(Comparator.reverseOrder())  
                    .skip(1)                            
                    .findFirst()                        
                    .orElse(-1);                  

            // Print result
            System.out.println(secondHighest);
        }
    }
}
