public class Task_1 {
    public static void main(String[] args) {
        // 1. Выведите таблицу умножения 1-9

        for(int col = 1; col < 10; col++){
            for(int row = 1; row < 10; row++) {
                if (row * col < 10) {
                    System.out.print(row * col + "   ");
                } else {
                    System.out.print(row * col + "  ");
                }
            }

            System.out.println();
        }





    }
}
