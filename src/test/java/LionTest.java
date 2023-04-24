
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionTest {
    private final String sex;
    Feline feline = Mockito.mock(Feline.class);

     public LionTest (String sex) {
        this.sex = sex;
     }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                { "Самка"},
                { "Самец"},

        };
    }
    @Test
    public void getKittensReturnCorrectValue() throws Exception {
         Lion lion = new Lion(feline, sex);
        int expectedKittensValue = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensValue = lion.getKittens();
        assertEquals(expectedKittensValue,actualKittensValue );
    }

    @Test
    public void checkDoesHaveMane_LionHasMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean expectedMane = false;
        if ("Самец".equals(sex)) {
            expectedMane = true;
        }

        boolean actualMane = lion.doesHaveMane();
        assertEquals(expectedMane, actualMane);

    }

    @Test
    public void checkGetFood_LionIsPredator() throws Exception {
         Lion lion = new Lion(feline, sex);
         List<String> expectedFoodValue = Arrays.asList("Животные", "Птицы", "Рыба");
         Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
         List<String> actualFoodValue = lion.getFood();
         assertEquals(expectedFoodValue, actualFoodValue);
    }
}
