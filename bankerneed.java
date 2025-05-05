public class Main {

    public static void main(String[] args) {
        int[][] allocation = {
            {0, 1, 0},
            {2, 0, 0},
            {3, 0, 2},
            {2, 1, 1},
            {0, 0, 2}
        };

        int[][] max = {
            {7, 5, 3},
            {3, 2, 2},
            {9, 0, 2},
            {2, 2, 2},
            {4, 3, 3}
        };

        int[][] need = new int[5][3];

        System.out.println("Need Matrix:");
        System.out.println("Process | R1 R2 R3");
        System.out.println("--------|---------");

        for (int i = 0; i < 5; i++) {
            System.out.print("P" + i + "      | ");
            for (int j = 0; j < 3; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
                System.out.print(need[i][j] + "  ");
            }
           System.out.println();
        }
    }
}
