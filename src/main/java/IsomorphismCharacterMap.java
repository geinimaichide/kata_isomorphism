import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangwei
 */
public class IsomorphismCharacterMap {

    private HashMap<Character, Character> map;

    public IsomorphismCharacterMap() {
        map = new HashMap<Character, Character>();
    }

    public boolean checkCharacterMap(char one, char another) {

        for (Map.Entry<Character, Character> characterMap : map.entrySet()) {
            Character key = characterMap.getKey();
            Character value = characterMap.getValue();
            if (key == one && value != another) {
                return false;
            }

            if (key != one && value == another) {
                return false;
            }
        }
        map.put(one, another);
        return true;
    }

    public int size() {
        return map.size();
    }
}
