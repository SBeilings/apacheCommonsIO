import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File sourceFiel = new File("files/target.txt");
        File destFile = new File("files/new_file.txt");

        try {
            FileUtils.copyFile(sourceFiel,destFile);
            System.out.println("File Copied!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
