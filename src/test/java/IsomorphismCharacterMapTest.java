import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IsomorphismCharacterMapTest {
    @Test
    public void should_test_check_character_map() {
        IsomorphismCharacterMap characterMap = new IsomorphismCharacterMap();
        assertThat(characterMap.checkCharacterMap('a', 'a'), is(true));
        assertThat(characterMap.size(), is(1));

        assertThat(characterMap.checkCharacterMap('a', 'A'), is(false));
        assertThat(characterMap.checkCharacterMap('b', 'c'), is(true));
    }
}
