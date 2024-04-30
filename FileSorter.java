import java.io.File;
import java.util.Comparator;

public class FileSorter {

    // Bubble sort implementation
    public static void bubbleSort(File[] files, Comparator<File> comparator) {
        int n = files.length;
        if(n==0)
        {
        	return;
        }
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (comparator.compare(files[i - 1], files[i]) > 0) {
                    // Swap files[i-1] and files[i]
                    File temp = files[i - 1];
                    files[i - 1] = files[i];
                    files[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length != 1) {
            System.out.println("Usage: java FileSorter <sorting_criteria>");
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

        bubbleSort(files, comparator);

        // Print sorted files
        for (File file : files) {
            System.out.println(file.getName() + " - " + file.length() + " bytes");
        }
    }
}
