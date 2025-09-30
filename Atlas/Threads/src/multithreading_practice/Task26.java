import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Task26 {

    public static void main(String[] args) {
        // Define the source and destination file paths
        Path sourcePath = Paths.get("path/to/your/source_image.jpg"); // Replace with your source image path
        Path destinationPath = Paths.get("path/to/your/destination_image.jpg"); // Replace with your desired destination path

        try {
            // Copy the file
            // REPLACE_EXISTING option overwrites the destination file if it already exists
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image copied successfully from " + sourcePath + " to " + destinationPath);
        } catch (IOException e) {
            System.err.println("Error copying image: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
