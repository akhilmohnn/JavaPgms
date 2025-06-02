import java.util.*;

class Matrix {
    int[][] a, b, sum, product;
    int rows1, cols1, rows2, cols2;

    void readMatrices() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of Matrix A: ");
        rows1 = sc.nextInt();
        cols1 = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        rows2 = sc.nextInt();
        cols2 = sc.nextInt();

        a = new int[rows1][cols1];
        b = new int[rows2][cols2];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols1; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows2; i++)
            for (int j = 0; j < cols2; j++)
                b[i][j] = sc.nextInt();
    }

    void addMatrices() {
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Cannot add matrices of different sizes.");
            sum = null;
            return;
        }
        sum = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols1; j++)
                sum[i][j] = a[i][j] + b[i][j];
    }

    void multiplyMatrices() {
        if (cols1 != rows2) {
            System.out.println("Cannot multiply matrices: columns of A must equal rows of B.");
            product = null;
            return;
        }
        product = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols1; k++)
                    product[i][j] += a[i][k] * b[k][j];
            }
    }

    void display() {
        if (sum != null) {
            System.out.println("Sum of matrices:");
            for (int i = 0; i < sum.length; i++) {
                for (int j = 0; j < sum[0].length; j++)
                    System.out.print(sum[i][j] + " ");
                System.out.println();
            }
        }

        if (product != null) {
            System.out.println("Product of matrices:");
            for (int i = 0; i < product.length; i++) {
                for (int j = 0; j < product[0].length; j++)
                    System.out.print(product[i][j] + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.readMatrices();
        m.addMatrices();
        m.multiplyMatrices();
        m.display();
    }
}
