public class Task_2 {
    public static void main(String[] args) {
        // 2. Выведите таблицу умножения 1-20
        for(int col = 1; col < 21; col++){
            for(int row = 1; row < 21; row++) {
                if (row * col < 10) {
                    System.out.print(row * col + "    ");
                } else if(row * col < 100) {
                    System.out.print(row * col + "   ");
                } else {
                    System.out.print(row * col + "  ");
                }
            }

            System.out.println();
        }
    }
}
