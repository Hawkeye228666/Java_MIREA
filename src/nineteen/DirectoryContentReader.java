package nineteen;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryContentReader {
    public static List<String> readDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                return Arrays.asList(files);
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String directoryPath = "path/to/your/directory";
        List<String> directoryContent = readDirectory(directoryPath);

        System.out.println("First 5 elements of the directory content:");
        for (int i = 0; i < Math.min(5, directoryContent.size()); i++) {
            System.out.println(directoryContent.get(i));
        }
    }
}