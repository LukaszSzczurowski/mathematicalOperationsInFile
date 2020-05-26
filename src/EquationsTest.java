import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class EquationsTest {
    public static void main(String[] args) {
        String fileMath = "math.txt";
        String fileCalcultions = "calculation.txt";
        try {
            String[] strings = FileUtils.readData(fileMath);
            System.out.println(Arrays.toString(strings));
            Equations[] equations = FileUtils.calculations(strings);
            FileUtils.save(equations, fileCalcultions);

        }catch (IOException e) {
                System.err.println("Błąd zapisu pliku " + fileCalcultions);
            }
    }
}
