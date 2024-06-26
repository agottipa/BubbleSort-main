// Comparator for sorting files by name

import java.io.File;
import java.util.Comparator;

class FileNameComparator implements Comparator<File> {
    @Override
    public int compare(File file1, File file2) {
        return file1.getName().compareTo(file2.getName());
    }
}