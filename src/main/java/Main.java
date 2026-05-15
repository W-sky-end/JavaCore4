import java.util.*;
import java.util.stream.Collectors;

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

        List<String> player = List.of(
                "max",
                "ivan",
                "anna",
                "oleg",
                "mia",
                "alexander",
                "leo"
        );
        List<String> result = player.stream().filter(a -> a.length() > 3).map(a -> a.substring(0, 1).toUpperCase() + a.substring(1))
                .sorted((a, b) -> a.length() - b.length()).toList();

        List<String> logs = List.of(
                "max joined",
                "ivan left",
                "anna joined",
                "mia joined",
                "oleg banned",
                "leo joined",
                "bob left"
        );
        Set<String> joined = logs.stream().filter(a -> a.endsWith("joined")).collect(Collectors.toSet());
        Set<String> collect = joined.stream().map(a -> a.split(" ")[0]).collect(Collectors.toSet());
        Set<String> result2 = collect.stream()
                .map(a -> a.substring(0, 1).toUpperCase() + a.substring(1))
                .sorted()
                .collect(Collectors.toSet());
        System.out.println(result2);

        List<String> items = List.of(
                "sword:rare",
                "potion:common",
                "shield:epic",
                "bow:rare",
                "apple:common",
                "staff:epic",
                "dagger:common"
        );

        List<String> graduation = items.stream()
                .filter(a -> a.endsWith("rare") || a.endsWith("epic")).toList();
        List<String> finalEdit = graduation.stream()
                .map(a -> a.split(":")[0]).map(a -> a.substring(0, 1).toUpperCase() + a.substring(1))
                .sorted((a, b) -> a.length() - b.length()).toList();
        System.out.println(finalEdit);
        List<String> loot = List.of(
                "sword:rare",
                "potion:common",
                "shield:epic",
                "bow:rare",
                "apple:common",
                "staff:epic",
                "dagger:rare",
                "ring:epic",
                "potion:rare",
                "apple:rare"
        );
        List<String> lootEdit = loot.stream().filter(a -> a.endsWith("epic")).map(a->a.split(":")[0])
                .map(a->a.substring(0,1).toUpperCase() + a.substring(1)).sorted().distinct().toList();
        Map<String, Long> rarityCount = loot.stream()
                .map(a -> a.split(":")[1])
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));



    }
}