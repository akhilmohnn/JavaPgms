import java.io.File;
import java.util.Scanner;

public class DirectoryExplorer {

    public static void listFilesAndDirs(File dir) {
        if (dir.exists() && dir.isDirectory()) {
            File[] items = dir.listFiles();
            System.out.println("\nContents of: " + dir.getAbsolutePath());

            if (items != null) {
                for (File item : items) {
                    if (item.isDirectory()) {
                        System.out.println("[DIR]  " + item.getName());
                    } else {
                        System.out.println("       " + item.getName());
                    }
                }
            } else {
                System.out.println("Unable to access directory.");
            }
        } else {
            System.out.println("The path is not a directory or does not exist.");
        }
    }

    public static boolean searchFile(File dir, String fileName) {
        if (dir.exists() && dir.isDirectory()) {
            File[] items = dir.listFiles();
            if (items != null) {
                for (File item : items) {
                    if (item.isDirectory()) {
                        if (searchFile(item, fileName)) {
                            return true; // found in subdirectory
                        }
                    } else if (item.getName().equalsIgnoreCase(fileName)) {
                        System.out.println("File found at: " + item.getAbsolutePath());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String dirPath = scanner.nextLine();
        File dir = new File(dirPath);

        listFilesAndDirs(dir);

        System.out.print("\nEnter file name to search: ");
        String searchFile = scanner.nextLine();

        boolean found = searchFile(dir, searchFile);
        if (!found) {
            System.out.println("File '" + searchFile + "' not found in the directory.");
        }

        scanner.close();
    }
}
