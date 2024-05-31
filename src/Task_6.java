public class Task_6 {
    public static void main(String[] args) {
        // 6. Создайте матрицу int[][], заполните её таблицей умножения 1-9, выведите её.

        int[][] arr = new int[9][9];


        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++) {
                arr[row][col] = (col + 1 ) * (row + 1);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] < 10) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
