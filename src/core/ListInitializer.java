package core;

import java.util.LinkedList;
import java.util.List;

public class ListInitializer {

    private static final CliReader reader = new CliReader();

    public List<String> initializeFirstList() {
        List<String> readLines = new LinkedList<>();
        System.out.println("Enter first array values.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(String.format("Left %s values.", 10 - i));
            System.out.print(String.format("%s: ", i));
            readLines.add(reader.read());
        }
        System.out.println("Firs array values: " + readLines);

        return readLines;
    }

    public List<String> initializeSecondList() {
        List<String> readLines = new LinkedList<>();
        System.out.println("\n\nEnter second array values (max 9). Type \"end\" for finish.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(String.format("Left %s values.", 10 - i));
            System.out.print(String.format("%s: ", i));
            String readLine = reader.read();
            if (readLine.equals("end"))
                break;
            readLines.add(readLine);
        }
        System.out.println("Second array values: " + readLines);

        return readLines;
    }

}
