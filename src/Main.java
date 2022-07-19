import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] numbersM1 = {2,3,1,4,3,5};
        int[] numbersM2 = {1,0,2,3,3,-1,-2,1,3};

        int sizeOfMatrixAX = 2;
        int sizeOfMatrixAY = 3;

        System.out.println(" ------------------------------ " + " MATRIX A: " + " ------------------------------ ");
        int[][] matrixA = matrixCreator(numbersM1, sizeOfMatrixAX, sizeOfMatrixAY);
        System.out.println(" ------------------------------ " + " MATRIX B: " + " ------------------------------ ");
        int[][] matrixB = matrixCreator(numbersM2, 3, 3);

        System.out.println(" ------------------------------ " + " RESULT MATRIX: " + " ------------------------------ ");
        int[][] resultMatrix = matrixMultiplications(matrixA, matrixB, 2, 3, 3, 3);

        for (int i = 0; i < sizeOfMatrixAX; i++) {
            for (int j = 0; j < sizeOfMatrixAY; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] matrixMultiplications(int[][] firstMatrix, int[][] secondMatrix, int sizeAX, int sizeAY, int sizeBX, int sizeBY) {
        if (sizeAY != sizeBX) {
            System.out.println("Cannot do the calculation !");
            return null;
        }
        int[][] resultMatrix = new int[sizeAX][sizeAY];

        for (int i = 0; i < sizeAX; i++) {
            int resultNumber = 0;
            for (int j = 0; j < sizeBX; j++) {
                for (int k = 0; k < sizeBY; k++) {
                    int numberOfMA = firstMatrix[i][k];
                    int numberOfMB = secondMatrix[k][j];
                    resultNumber += numberOfMA * numberOfMB;
                }
                resultMatrix[i][j] = resultNumber;
                resultNumber = 0;
            }
        }
        return resultMatrix;
    }

    public static int[][] matrixCreator(int[] matrixNumbers, int paSizeX, int paSizeY) {
        int[][] resultMatrix = new int[paSizeX][paSizeY];

        for (int i = 0; i < paSizeX; i++) {
            for (int j = 0; j < paSizeY; j++) {
                resultMatrix[i][j] = matrixNumbers[j+(i*paSizeY)];
            }
        }

        for (int i = 0; i < paSizeX; i++) {
            for (int j = 0; j < paSizeY; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        return resultMatrix;
    }



}
