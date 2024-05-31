import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        // 7. Создайте матрицу int[][], заполните её календарём на месяц.
        //  пн вт ср чт пт сб вс
        //         1  2  3  4  5
        //   6  7  8  9 10 11 12



        int x = 31;
        int d = 1; // установим день недели с которого начинается месяц пн - 0 вт -1 ... вс - 6
        String[][] month = new String [6][7];

        for (String[] i : month){
            Arrays.fill(i, "   ");
        }


        int dey = 1;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 7; j++) {
                if(dey == 1) {
                    j += d;
                }
                if(dey <= x) {
                    if(dey < 10) {
                        month[i][j] = String.valueOf(dey + "  ");
                    } else {
                        month[i][j] = String.valueOf(dey + " ");
                    }
                } else {
                    break;
                }
                dey ++;
            }
            if(dey == x) {
                break;
            }
        }
        System.out.println("пн вт ср чт пт сб вс");
        for (String[] g : month) {
            for (String j : g) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
