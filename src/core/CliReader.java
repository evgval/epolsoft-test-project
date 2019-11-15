package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CliReader {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String read() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error entering value. " + e.getMessage());
        }
    }

}
