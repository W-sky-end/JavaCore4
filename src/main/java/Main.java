import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        numbers.sort((a, b) -> b - a);

        System.out.println(numbers);


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Vadik");
        names.add("Mia");

        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);

        names.sort((a, b) -> a.length() - b.length());
        System.out.println(names);

        Map<String, Integer> players = new HashMap<>();

        players.put("Max", 120);
        players.put("Ivan", 90);
        players.put("Oleg", 150);
        players.put("Anna", 110);
        players.put("Mia", 200);

        Set<Map.Entry<String, Integer>> entries = players.entrySet();
        System.out.println("Set entry map players : " + entries);

        List<Map.Entry<String, Integer>> playersList = new ArrayList<>(players.entrySet());
        System.out.println(playersList);
//        String bestScoresName = null;
//        int maxCount = 0;
//        for (Map.Entry<String, Integer> entry : players.entrySet()) {
//            if (entry.getValue() > maxCount) {
//                maxCount = entry.getValue();
//                bestScoresName = entry.getKey();
//            }
//        }
//        System.out.println(bestScoresName + " : "  + maxCount);    cкажу откровенно взял этот метод с соседнего урока , вспомнил что есть сам не писал
        playersList.sort((a, b) -> a.getValue().compareTo(b.getValue()));
        System.out.println("Best Player is " + playersList.getLast().getKey() + " : "
                + playersList.getLast().getValue() + "points");

        // сортировка выше
        System.out.println(playersList);
        playersList.sort((a, b) -> a.getKey().compareTo(b.getKey()));


    }
}