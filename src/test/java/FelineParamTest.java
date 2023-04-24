
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    private final Integer kittensCount;
    public FelineParamTest (Integer kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                {0},
                {2},

        };
    }



    @Test
    public void checkGetKittensParameterCorrectValue() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(kittensCount);
        int expectedKittensCount = kittensCount;
        assertEquals(expectedKittensCount, actualKittensCount);
    }



}
