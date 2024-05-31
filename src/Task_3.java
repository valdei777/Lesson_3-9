public class Task_3 {
    public static void main(String[] args) {
        // 3. Создайте двумерный массив, задайте для него значения, выведите его элементы

        int[][] arr =  {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        for(int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                System.out.print(arr[col][row] + " ");
            }
            System.out.println();
        }
    }
}
