import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SomeDummyTest {

    @Test
    public void addition() {
        SomeDummy someDummy = new SomeDummy();
        int addition = someDummy.addition(1, 1);
        assertThat(addition).isEqualTo(2);

    }
}