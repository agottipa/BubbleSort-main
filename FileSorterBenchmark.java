import java.io.File;
import java.util.Comparator;

public class FileSorterBenchmark {

    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length != 1) {
            System.out.println("Usage: java FileSorterBenchmark <sorting_criteria>");
            System.out.println("Available sorting criteria: size, name");
            return;
        }

        // Example usage: sorting files by size
        File directory = new File("C:\\Users\\16028\\Desktop\\amulyaassignment");
        File[] files = directory.listFiles();

        // Sort files based on the specified criteria
        Comparator<File> comparator;
        switch (args[0]) {
            case "size":
                comparator = new FileSizeComparator();
                break;
            case "name":
                comparator = new FileNameComparator();
                break;
            default:
                System.out.println("Invalid sorting criteria. Available options: size, name");
                return;
        }

        // Benchmarking - Measure time taken to sort files
        long startTime = System.nanoTime();
        FileSorter.bubbleSort(files, comparator);
        long endTime = System.nanoTime();

        // Calculate and print the time taken
        long elapsedTime = endTime - startTime;
        double seconds = (double) elapsedTime / 1_000_000_000.0;
        System.out.println("Time taken to sort files: " + seconds + " seconds");
    }
}
