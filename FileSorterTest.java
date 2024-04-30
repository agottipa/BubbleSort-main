import org.junit.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import static org.junit.Assert.*;

public class FileSorterTest {

    // Defining the directory path where test files will be created
    private final String testDirectoryPath = "C:\\Users\\16028\\Desktop\\test_files";

    // Test sorting files by size
    @Test
    public void testSortBySize() throws IOException {
        // Create test files within the predefined directory
        createTestFiles();

        // Get files from the predefined directory
        File directory = new File(testDirectoryPath);
        File[] files = directory.listFiles();

        // Sort files by size
        FileSorter.bubbleSort(files, new FileSizeComparator());

        // Expected order after sorting by size
        File[] expected = {
            files[0],
            files[1],
            files[2]  
        };

        // Assert that files are sorted correctly by size
        assertArrayEquals(expected, files);
    }

    // Test sorting files by name
    @Test
    public void testSortByName() throws IOException {
        // Create test files within the predefined directory
        createTestFiles();

        // Get files from the predefined directory
        File directory = new File(testDirectoryPath);
        File[] files = directory.listFiles();

        // Sort files by name
        FileSorter.bubbleSort(files, new FileNameComparator());

        // Expected order after sorting by name
        File[] expected = {
            files[0],
            files[1],
            files[2]
        };

        // Assert that files are sorted correctly by name
        assertArrayEquals(expected, files);
    }

    // Test sorting files in an empty directory
    @Test
    public void testSortEmptyDirectory() {
        // Define path for an empty directory
        String emptyDirectoryPath = "C:\\Users\\16028\\Desktop\\empty_directory";

        // Create empty directory
        File emptyDirectory = new File(emptyDirectoryPath);
        assertTrue(emptyDirectory.mkdirs());

        // Get files from the empty directory
        File[] files = emptyDirectory.listFiles();

        // Sort files by size
        FileSorter.bubbleSort(files, new FileSizeComparator());

        // Assert that files array is empty
        assertEquals(0, files.length);
    }

    // Test sorting files in a directory with single file
    @Test
    public void testSortSingleFile() throws IOException {
        // Define path for a directory with single file
        String singleFilePath = "C:\\Users\\16028\\Desktop\\single_file_directory";
        File singleFileDirectory = new File(singleFilePath);
        assertTrue(singleFileDirectory.mkdirs());

        // Create a single test file in the directory with some content
        File singleFile = new File(singleFilePath, "file1.txt");
        FileWriter writer = new FileWriter(singleFile);
        writer.write("Hello, world!");
        writer.close();

        // Get files from the directory with single file
        File[] files = singleFileDirectory.listFiles();

        // Sort files by size
        FileSorter.bubbleSort(files, new FileSizeComparator());

        // Assert that files array contains only the single file
        assertEquals(1, files.length);
        assertEquals("file1.txt", files[0].getName());
        // You can add additional assertions here to verify the content of the file
    }

    // Method to create test files within the predefined directory
    private void createTestFiles() throws IOException {
        // Create the directory if it doesn't exist
        File directory = new File(testDirectoryPath);
        if (!directory.exists()) {
            assertTrue(directory.mkdirs());
        }

        // Create test files with variable sizes and write content into the files
        Random random = new Random();
        for (int i = 1; i <= 3; i++) {
            int fileSize = random.nextInt(20) + 1; // Random size between 1 and 20 bytes
            File file = new File(testDirectoryPath, "file" + i + ".txt");
            FileWriter writer = new FileWriter(file);
            // Write content with size equal to the file size
            for (int j = 0; j < fileSize; j++) {
                writer.write("x");
            }
            writer.close();
        }
    }
}
