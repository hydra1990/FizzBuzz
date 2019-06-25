import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    private String outputMessage;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldBeFizzWhenIsMultipleOfThree() {
        //GIVEN
        int testForFizz = 3;
        //WHEN
        if (fizzBuzz.isFizz(testForFizz)) {
            outputMessage = "Fizz";
        }
        //THEN
        assertEquals("Fizz", outputMessage);
    }

    @Test
    public void ShouldBeBuzzWhenIsMultipleOfFive() {
        //GIVEN
        int testForBuzz = 5;
        //WHEN
        if (fizzBuzz.isBuzz(testForBuzz)) {
            outputMessage = "Buzz";
        }
        //THEN
        assertEquals("Buzz", outputMessage);
    }

    @Test
    public void testShouldBeFizzBuzzWhenMultipleOfThreeAndFive() {
        //GIVEN
        int testForFizzBuzz = 15;
        //WHEN
        if (fizzBuzz.isFizz(testForFizzBuzz) && fizzBuzz.isBuzz(testForFizzBuzz)) {
            outputMessage = "FizzBuzz";
        }
        //THEN
        assertEquals("FizzBuzz", outputMessage);
    }

    @Test
    public void testShouldPrintANumberIfItsNotAMultipleOfThreeNorFive() {
        //GIVEN
        int testNotFizzNorBuzz = 23;
        //WHEN
        if (fizzBuzz.isNotFizzBuzz(testNotFizzNorBuzz)) {
            outputMessage = testNotFizzNorBuzz + "";
        }
        //THEN
        assertEquals(testNotFizzNorBuzz + "", outputMessage);
    }
}
