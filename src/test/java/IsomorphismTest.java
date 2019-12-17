import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * kata 的同构题目
 * 判断两个字符是否同构
 * 比如 输入两字符串 abb、acc 返回 true，输入 foo、bar 返回 false
 * <p>
 * 1、最小步子，输入 a、b 返回true                 √
 * 2、验证，输入 ab 、 b 返回 false，同构长度应相等 √
 * <p>
 * 3、验证，输入 A、a 返回 true                                        √
 * <p>
 * 4、将字符放入 map，验证字符串是否相同，创建 IsomorphismCharacterMap   √
 */
public class IsomorphismTest {
    @Test
    public void should_test_put_a_isomorphism_b() {
        Isomorphism isomorphism = new Isomorphism("a", "b");
        assertThat(isomorphism.isomorphic(), is(true));
    }

    @Test
    public void should_test_put_ab_not_isomorphism_b() {
        Isomorphism isomorphism = new Isomorphism("ab", "b");
        assertThat(isomorphism.isomorphic(), is(false));
    }

    @Test
    public void should_test_put_A_isomorphism_a() {
        Isomorphism isomorphism = new Isomorphism("A", "a");
        assertThat(isomorphism.isomorphic(), is(true));
    }

    @Test
    public void should_test_put_foo_not_isomorphism_bar() {
        Isomorphism isomorphism = new Isomorphism("foo", "bar");
        assertThat(isomorphism.isomorphic(), is(false));
    }


    @Test
    public void should_test_put_abbc_isomorphism_accd() {
        Isomorphism isomorphism = new Isomorphism("abbc", "accd");
        assertThat(isomorphism.isomorphic(), is(true));
    }


}
