
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;



public class LionThrowTest {

    Feline feline = Mockito.mock(Feline.class);


    @Test
    public void checkDoesHaveMane_LionHasMane() throws Exception {
        try {
            Lion lion = new Lion(feline, "самка");
            lion.doesHaveMane();
        } catch (Exception thrown) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
        }

    }
}





