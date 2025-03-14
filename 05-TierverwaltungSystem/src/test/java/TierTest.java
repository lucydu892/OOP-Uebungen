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
    @Test
    public void hund_merkmalSaeugetier_test() {

        //given
        Hund testee = new Hund();

        //when
        String merkmalSaeugetierResult = testee.saeugtierMerkmal();

        //then
        Assertions.assertEquals("Ich bin ein Säugetier!",merkmalSaeugetierResult);
    }
    @Test
    public void katze_kannFauchen_test() {

        //given
        Katze testee = new Katze();

        //when
        String kannFauchenResult = testee.kannFauchen();
        //then
        Assertions.assertEquals("Fauch!",kannFauchenResult);
    }
}

