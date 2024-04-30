// Comparator for sorting files by size

import java.io.File;
import java.util.Comparator;
class FileSizeComparator implements Comparator<File> {
    @Override
    public int compare(File file1, File file2) {
        return Long.compare(file1.length(), file2.length());
    }
}