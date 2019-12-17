import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * kata 的同构题目
 * 判断两个字符是否同构
 * 比如 输入两字符串 abb、acc 返回 true，输入 foo、bar 返回 false
 *
 * 1、最小步子，输入 a、b 返回true
 * 2、
 */
public class IsomorphismTest {
    @Test
    public void should_test_put_a_isomorphism_b() {
        Isomorphism isomorphism = new Isomorphism("a", "b");
        assertThat(isomorphism.isomorphic(), is(true));
    }
}
