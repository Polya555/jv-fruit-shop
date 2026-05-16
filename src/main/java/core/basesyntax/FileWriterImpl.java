package core.basesyntax;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterImpl {
    @Override
    public void write(String data, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write file: " + fileName, e);
        }
    }
}
