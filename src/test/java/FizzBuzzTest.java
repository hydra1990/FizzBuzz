import org.junit.*;

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

    }

    @Test
    public void ShouldBeBuzzWhenIsMultipleOfFive() {
        //GIVEN

        //WHEN

        //THEN

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
