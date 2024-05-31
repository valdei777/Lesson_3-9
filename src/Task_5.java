public class Task_5 {
    public static void main(String[] args) {
        // 5. Создайте двумерный массив. Выведите его первый столбец
        int[][] arr =  {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
