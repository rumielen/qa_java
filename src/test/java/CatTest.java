import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    //getSound
    @Test
    public void getSoundReturnCorrectSound() {
        //Arrange
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        //Act
        String actualSound = cat.getSound();
        //Assert
        assertEquals(expectedSound, actualSound);
    }

    //getFood
    @Test
    public void checkGetFoodReturnEatMeat() throws Exception {
        List<String> expectedEat = Arrays.asList("Животные", "Птицы", "Рыба");
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        List<String> actualEat = cat.getFood();
        assertEquals(expectedEat, actualEat);

}

}
