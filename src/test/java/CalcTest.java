import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 목표
// int rs = Calc.run("((3 + 5) * 5 + -10) * 10 / 5");

public class CalcTest {
    @Test
    @DisplayName("3 + 5")
    public void t1(){
        int rs = Calc.run("3 + 5");

        assertThat(rs).isEqualTo(8);
    }

    @Test
    @DisplayName("1 * 3 / 3 + 5 - 5")
    public void t2(){
        int rs = Calc.run("1 * 3 / 3 + 5 - 5");

        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName("(3 + 5) * 5 + -10")
    public void t3() {
        int rs = Calc.run("((3 + 5) * 5 + -10)");
        assertThat(rs).isEqualTo(30);
    }
}
