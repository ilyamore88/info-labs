import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Osi {
    private static void inputStreamCopy(String path, String fileInName, String fileOutName) {
        FileInputStream in;
        FileOutputStream out;
        try {
            in = new FileInputStream(path + fileInName);
            out = new FileOutputStream(path + fileOutName);
            List<String> osiReverse = new ArrayList<>();
            int c;
            String line = "";
            while ((c = in.read()) != -1) {
                if ((char) c != '\n') {
                    line += (char) c;
                } else {
                    line += (char) c;
                    osiReverse.add(0, line);
                    line = "";
                }
            }
            if (!line.isEmpty()) {      //Если строка была последней и на ней не было переноса, то её необходимо добавить в файл отдельно
                line += '\n';
                osiReverse.add(0, line);
                line = "";
            }
            for (String lineOut : osiReverse) {
                out.write(lineOut.getBytes());
            }
            System.out.println("Osi reversed in " + fileOutName);
        } catch (IOException e) {
            System.out.println("Exception caught:");
            e.printStackTrace();
        }
    }

    private static void bufferedReaderCopy(String path, String fileInName, String fileOutName) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path + fileInName), Charset.defaultCharset())) {
            String line = null;
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path + fileOutName), Charset.defaultCharset(), CREATE)) {
                List<String> osiReverse = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    osiReverse.add(0, line + "\n");
                }
                for (String lineOut : osiReverse) {
                    writer.write(lineOut, 0, lineOut.length());
                }
                System.out.println("Osi reversed in " + fileOutName);
            } catch (IOException e) {
                System.out.println("Exceprion caught (write):");
                System.err.format("IOException: %s%n", e);
            }
        } catch (IOException e) {
            System.out.println("Exception caught (read):");
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/";
        inputStreamCopy(path, "osi.txt", "osiReverse1.txt");
        bufferedReaderCopy(path, "osi.txt", "osiReverse2.txt");
    }
}
