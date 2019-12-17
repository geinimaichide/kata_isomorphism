public class Isomorphism {
    private final String one;
    private final String another;

    private IsomorphismCharacterMap map;

    public Isomorphism(String one, String another) {
        this.one = one;
        this.another = another;
        map = new IsomorphismCharacterMap();
    }

    public boolean isomorphic() {
        if (one.length() != another.length()) {
            return false;
        }

        for (int i = 0; i < one.length(); i++) {
            char key = one.charAt(i);
            char value = another.charAt(i);
            if (!map.checkCharacterMap(key, value)) {
                return false;
            }
        }

        return true;
    }
}
