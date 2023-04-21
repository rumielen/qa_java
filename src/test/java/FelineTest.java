import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    private final Integer kittensCount;
    public FelineTest (Integer kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {

                {4},

        };
    }


    @Test
    //getKittens
    public void checkGetKittensCorrectValue() {
        Feline feline = Mockito.spy(new Feline());

        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;

        assertEquals(expectedKittensCount, actualKittensCount);

    }

    @Test
    public void checkGetKittensParameterCorrectValue() {
        Feline feline = Mockito.spy(new Feline());
        int actualKittensCount = feline.getKittens(kittensCount);
        int expectedKittensCount = kittensCount;
        assertEquals(expectedKittensCount, actualKittensCount);
    }


    @Test
    //eatMeat
    public void checkEatMeatCorrectValue() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Feline felineSpy = Mockito.spy(feline);
        List<String> actualFood = felineSpy.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
    @Test
    //getFamily
    public void checkGetFamilyCorrectValue() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }


}

