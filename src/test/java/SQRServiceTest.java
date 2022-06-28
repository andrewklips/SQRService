import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.maven.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void calcSqr() {
        SQRService service = new SQRService();


        int expected = 1;
        int actual = service.calcSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }

}