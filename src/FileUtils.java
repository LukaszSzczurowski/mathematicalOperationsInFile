import java.io.*;
import java.util.Scanner;

public class FileUtils {

    static void save(Equations[] equations, String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (Equations e : equations) {
            bw.write(e.toString());
            bw.newLine();
        }
        bw.close();
    }

    static String[] readData(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int size = size(fileName);
        String[] strings = new String[size];
        for (int i = 0; i < size; i++) {
            strings[i] = scanner.nextLine();
        }

        return strings;
    }


    static Equations[] calculations(String[] strings) {
        Equations[] equations = new Equations[strings.length];
        for (int i = 0; i < equations.length; i++) {
            String[] splitTableStrings = strings[i].split(" ");
            int a = Integer.parseInt(splitTableStrings[0]);
            int b = Integer.parseInt(splitTableStrings[2]);
            String mathChar = splitTableStrings[1];
            int result = result(a, b, mathChar);
            equations[i] = new Equations(a, b, mathChar, result);
        }
        return equations;
    }

    private static int result(int a, int b, String mathChar) {

        switch (mathChar) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Nie wolno dzielić przez zero!!!");
                }
                return a / b;
            default:
                System.out.println("Nie znam takiej operacji matematycznej");
        }
        return -1;
    }

    private static int size(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        scanner.close();
        return lines;
    }
}
