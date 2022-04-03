package com.exampel.treirad;

import java.util.Scanner;

public class Treirad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("starta spelet");
        System.out.print("spelare 1 ");
        String sp1 = in.nextLine();
        System.out.print("spelare 2");
        String sp2 = in.nextLine();

        char[][] spelplan = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spelplan[i][j] = '_';
            }
        }

        boolean spelare1 = true;
        boolean gameEnded = false;

        while (!gameEnded) {

            visaspelplan(spelplan);


            char c = '-';
            if (spelare1) {
                c = 'x';
            } else {
                c = 'o';
            }

            if (spelare1) {
                System.out.println(sp1 + "'tur (x):");
            } else {
                System.out.println(sp2 + "'tur(o):");
            }

            int rad = 0;
            int kol = 0;


            while (true) {
                System.out.print("rad nummer (0, 1,eller 2)");
                rad = in.nextInt();
                System.out.print("kolumn nummer (0, 1, eller 2) ");
                kol = in.nextInt();
                 if(spelplan[rad][kol] != '_') {
                    System.out.println("platsenär tagen");

                    //Otherwise, the position is valid so break out of the while loop
                } else {
                    break;
                }

            }
            spelplan[rad][kol] = c;
            if (spelaHarVunnit(spelplan) == 'x') {
                System.out.println(sp1 + " har vunnit!");
                gameEnded = true;
            } else if (spelaHarVunnit(spelplan) == 'o') {
                System.out.println(sp2 + " har vunnit!");
                gameEnded = true;
            } else {

                if (spelplanFull(spelplan)) {
                    System.out.println("oavgjort");
                    gameEnded = true;
                } else {
                    spelare1 = !spelare1;
                }


            }

        }
        visaspelplan(spelplan);
    }
    private static void visaspelplan(char[][] spelplan) {

        System.out.println("spelplan:");
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(spelplan[i][j]);
            }
            System.out.println();
        }
    }
    public static char spelaHarVunnit(char[][] spelplan) {

        for(int i = 0; i < 3; i++) {
            if(spelplan[i][0] == spelplan[i][1] && spelplan[i][1] == spelplan[i][2] && spelplan[i][0] != '_') {
                return spelplan[i][0];
            }
        }

        for(int j = 0; j < 3; j++) {
            if(spelplan[0][j] == spelplan[1][j] && spelplan[1][j] == spelplan[2][j] && spelplan[0][j] != '_') {
                return spelplan[0][j];
            }
        }

        if(spelplan[0][0] == spelplan[1][1] && spelplan[1][1] == spelplan[2][2] && spelplan[0][0] != '_') {
            return spelplan[0][0];
        }
        if(spelplan[2][0] == spelplan[1][1] && spelplan[1][1] ==  spelplan[0][2] && spelplan[2][0] != '_') {
            return spelplan[2][0];
        }

        return '_';

    }

    public static boolean spelplanFull(char[][] spelplan) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(spelplan[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}



/*





    private static void visaspelplan(char[][] spelplan) {

            System.out.println("spelplan:");
            for(int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(spelplan[i][j]);
                }
                System.out.println();
            }
    }
    public static char spelaHarVunnit(char[][] spelplan) {

        for(int i = 0; i < 3; i++) {
            if(spelplan[i][0] == spelplan[i][1] && spelplan[i][1] == spelplan[i][2] && spelplan[i][0] != '-') {
                return spelplan[i][0];
            }
        }

        for(int j = 0; j < 3; j++) {
            if(spelplan[0][j] == spelplan[1][j] && spelplan[1][j] == spelplan[2][j] && spelplan[0][j] != '-') {
                return spelplan[0][j];
            }
        }

        if(spelplan[0][0] == spelplan[1][1] && spelplan[1][1] == spelplan[2][2] && spelplan[0][0] != '-') {
            return spelplan[0][0];
        }
        if(spelplan[2][0] == spelplan[1][1] && spelplan[1][1] ==  spelplan[0][2] && spelplan[2][0] != '-') {
            return spelplan[2][0];
        }

        return ' ';

    }

    public static boolean spelplanFull(char[][] spelplan) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(spelplan[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}*/

