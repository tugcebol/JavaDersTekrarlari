package misc;

public class SudokuCozucu {

    public static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] sudokuTablosu = {


                {0, 6, 2, 1, 0, 4, 0, 0, 8},
                {8, 0, 9, 0, 0, 0, 7, 0, 0},
                {0, 0, 0, 7, 6, 0, 0, 1, 0},
                {0, 9, 0, 4, 0, 0, 8, 6, 0},
                {0, 3, 0, 0, 0, 0, 0, 7, 0},
                {0, 5, 7, 0, 0, 1, 0, 9, 0},
                {0, 7, 0, 0, 2, 6, 0, 0, 0},
                {0, 0, 5, 0, 0, 0, 6, 0, 9},
                {3, 0, 0, 9, 0, 5, 4, 2, 0}
        };

        tabloCiz(sudokuTablosu);

        if (tabloyuCoz(sudokuTablosu)) {
            System.out.println("");
            System.out.println("Sudoku başarıyla çözüldü!");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Geçersiz tablo!");
            System.out.println("");
        }

        tabloCiz(sudokuTablosu);

    }

    private static void tabloCiz(int[][] sudokuTablosu) {

        for (int satir = 0; satir < GRID_SIZE; satir++) {
            if (satir % 3 == 0 && satir != 0){
                System.out.println("-----------");
            }
            for (int sutun = 0; sutun < GRID_SIZE; sutun++) {
                if (sutun % 3 == 0 && sutun != 0){
                    System.out.print("|");
                }
                System.out.print(sudokuTablosu[satir][sutun]);
            }
            System.out.println("");
        }
    }

    private static boolean satirTara(int[][] sudokuTablosu, int sayi, int satir) { // tablonun satırlarını tarar

        for (int i = 0; i < GRID_SIZE; i++) {

            if (sudokuTablosu[satir][i] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean sutunTara(int[][] sudokuTablosu, int sayi, int sutun) { // tablonun sutunlarını tarar

        for (int i = 0; i < GRID_SIZE; i++) {

            if (sudokuTablosu[i][sutun] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean kutucukTara(int[][] sudokuTablosu, int sayi, int satir, int sutun) { // 3x3'lük kutuları check eder
        // (toplam 9 tane kutucuk var)

        int kutucukSatir = satir - satir % 3;
        int kutucukSutun = sutun - sutun % 3;

        for (int i = kutucukSatir; i < kutucukSatir + 3; i++) {
            for (int j = kutucukSutun; j < kutucukSutun + 3; j++) {
                if (sudokuTablosu[i][j] == sayi) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean yerlesimDogruMu(int[][] sudokuTablosu, int sayi, int satir, int sutun) {

        return !satirTara(sudokuTablosu, sayi, satir) &&
                !sutunTara(sudokuTablosu, sayi, sutun) &&
                !kutucukTara(sudokuTablosu, sayi, satir, sutun);
    }

    public static boolean tabloyuCoz(int[][] sudokuTablosu) {

        for (int satir = 0; satir < GRID_SIZE; satir++) {
            for (int sutun = 0; sutun < GRID_SIZE; sutun++) {
                if (sudokuTablosu[satir][sutun] == 0) {
                    for (int denenecekSayi = 1; denenecekSayi <= GRID_SIZE; denenecekSayi++) {
                        if (yerlesimDogruMu(sudokuTablosu, denenecekSayi, satir, sutun)) {
                            sudokuTablosu[satir][sutun] = denenecekSayi;

                            if (tabloyuCoz(sudokuTablosu)) {
                                return true;
                            } else {
                                sudokuTablosu[satir][sutun] = 0;
                            }
                        }
                    }
                    return false;
                }
            }

        }
        return true;
    }

}


