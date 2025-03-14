import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TierTest {

    @Test
    public void papagei_laut_test() {

        // given
        Papagei testee = new Papagei();

        // when
        String gibLautResult = testee.gibLaut();

        // then
        Assertions.assertEquals("Squawk", gibLautResult);
    }
}

