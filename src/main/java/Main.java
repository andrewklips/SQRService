import ru.netology.maven.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Количество кадратов = " + service.calcSqr(10, 99));

    }
}
