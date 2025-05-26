import java.io.*;

class FileInputDemo3 {
    public static void main(String args[]) {
        try {
            FileInputStream f = new FileInputStream("fileinputdemo3.java");

            int size = f.available();
            System.out.println("Total Size = " + size);

            int n = size / 40;
            System.out.println("Now the size is = " + n);

            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println();

            int a = f.available();  // Remaining bytes
            System.out.println("Still Available = " + a);

            long y = f.skip(a / 2); // Skip half of the remaining bytes
            System.out.println("Skipped = " + y);

            System.out.println("Now the new file is:");
            for (int i = 0; i < y; i++) {
                System.out.print((char) f.read());
            }

            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
