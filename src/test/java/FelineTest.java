import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    //getKittens
    public void checkGetKittensCorrectValue() {
        Feline feline = new Feline();

        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;

        assertEquals(expectedKittensCount, actualKittensCount);

    }

    @Test
    //eatMeat
    public void checkEatMeatCorrectValue() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

        List<String> actualFood = feline.eatMeat();
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

