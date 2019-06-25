import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fb;
    private String text;

    @Before
    public void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    public void shouldBeFizzWhenIsMultipleOfThree() {
        //GIVEN
        int nfizz = 3;
        //WHEN
        if (fb.isFizz(nfizz)) {
            text = "Fizz";
        }
        //THEN
        assertEquals("Fizz", text);
    }

    @Test
    public void ShouldBeBuzzWhenIsMultipleOfFive() {
        //GIVEN
        int nbuzz = 5;
        //WHEN
        if (fb.isBuzz(nbuzz)) {
            text = "Buzz";
        }
        //THEN
        assertEquals("Buzz", text);
    }

    @Test
    public void testShouldPrintANumberIfItsNotAMultipleOfThreeNorFive() {
        //GIVEN

        //WHEN

        //THEN

    }


//    @After
//    public void tearDown() throws Exception {
//        throw new Exception();
//    }
}
