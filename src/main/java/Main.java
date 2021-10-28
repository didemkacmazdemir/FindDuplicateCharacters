import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = calculateDuplicateCharacters("didem");
        printMap(map);
    }
    public static Map<Character, Integer> calculateDuplicateCharacters(final String str){
        char[] strArr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : strArr){
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (k, v) -> v + 1);
        }
        return map;
    }

    public static void printMap(Map<Character, Integer> map){
        if(map != null){
            map.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
        }
    }
}
