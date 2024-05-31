public class Task_4 {
    public static void main(String[] args) {
        // 4. Создайте двумерный массив. Выведите его предпоследнюю строчку
        int[][] arr =  {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[1][i] + " ");
        }
    }
}
