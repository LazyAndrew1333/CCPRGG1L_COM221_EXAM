public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");
        
        for (int row1 = 0; row1 < array.length; row1++) {
            System.out.println();
            for (int column1 = 0; column1 < array.length; column1++) {
                if (row1 == 2 && column1 <= 8) {
                    System.out.print("|" + array[row1][column1] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // FRAPPUCCINO - (10 points)
        System.out.println(" ");
        System.out.println();
        System.out.println("2. FRAPPUCCINO ");

        for (int row2 = 0; row2 < array.length; row2++) {
            System.out.println();
            for (int column2 = 0; column2 < array.length; column2++) {
                if (row2 == 13 && column2 <= 12 && column2 >=2) {
                    System.out.print("|" + array[row2][column2] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");

        for (int row3 = 0; row3 < array.length; row3++) {
            System.out.println();
            for (int column3 = 0; column3 < array.length; column3++) {
                if (column3 == 9 && row3 >= 2 && row3 <= 9) {
                    System.out.print("|" + array[row3][column3] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");

        for (int row4 = 0; row4 < array.length; row4++) {
            System.out.println();
            for (int column4 = 0; column4 < array.length; column4++) {
                if (row4 == 7 && column4 == 0 || row4 == 8 && column4 == 1 || row4 == 9 && column4 == 2 || row4 == 10 && column4 == 3 || row4 == 11 && column4 == 4 || row4 == 12 && column4 == 5) {
                    System.out.print("|" + array[row4][column4] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");

        for (int row5 = 0; row5 < array.length; row5++) {
            System.out.println();
            for (int column5 = 0; column5 < array.length; column5++) {
                if (row5 == 12 && column5 == 0 || row5 == 11 && column5 == 1 || row5 == 10 && column5 == 2 || row5 == 9 && column5 == 3 || row5 == 8 && column5 == 4 || row5 == 7 && column5 == 5 || row5 == 6 && column5 == 6 || row5 == 5 && column5 == 7) {
                    System.out.print("|" + array[row5][column5] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");

        for (int row6 = 0; row6 < array.length; row6++) {
            System.out.println();
            for (int column6 = 0; column6 < array.length; column6++) {
                if (row6 == 1 && column6 >= 4 && column6 <= 10) {
                    System.out.print("|" + array[row6][column6] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");

        for (int row7 = 0; row7 < array.length; row7++) {
            System.out.println();
            for (int column7 = 0; column7 < array.length; column7++) {
                if (column7 == array.length - 1 && row7 >= 1 && row7 <= 11) {
                    System.out.print("|" + array[row7][column7] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");

        for (int row8 = 0; row8 < array.length; row8++) {
            System.out.println();
            for (int column8 = 0; column8 < array.length; column8++) {
                if (row8 == 0 && column8 == 14 || row8 == 1 && column8 == 13 || row8 == 2 && column8 == 12 || row8 == 3 && column8 == 11 || row8 == 4 && column8 == 10 || row8 == 5 && column8 == 9 || row8 == 6 && column8 == 8 || row8 == 7 && column8 == 7 || row8 == 8 && column8 == 6) {
                    System.out.print("|" + array[row8][column8] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // LUNES - (10 points)
        System.out.println(" ");
        System.out.println("9. LUNES ");

        for (int row9 = 0; row9 < array.length; row9++) {
            System.out.println();
            for (int column9 = 0; column9 < array.length; column9++) {
                if (row9 == 4 && column9 == 0 || row9 == 3 && column9 == 1 || row9 == 2 && column9 == 2 || row9 == 1 && column9 == 3 || row9 == 0 && column9 == 4) {
                    System.out.print("|" + array[row9][column9] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================
        // SIOMAI - (10 points)
        System.out.println(" ");
        System.out.println("10. SIOMAI ");

        for (int row10 = 0; row10 < array.length; row10++) {
            System.out.println();
            for (int column10 = 0; column10 < array.length; column10++) {
                if (row10 == 3 && column10 == 6 || row10 == 4 && column10 == 7 || row10 == 5 && column10 == 8 || row10 == 6 && column10 == 9 || row10 == 7 && column10 == 10 || row10 == 8 && column10 == 11) {
                    System.out.print("|" + array[row10][column10] + "|");
                } else {
                    System.out.print(" - ");
                }
            }
        }

        // =============================================================

        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("11. Elizer needs your help!");

        // Elizer loves to watch professional basketball. He is an avid fan of a certain
        // team which he follows on social media.
        // One day, he saw a post where his favorite team revealed their brand new home
        // and guest uniforms for the upcoming season.

        // The home and guest uniform are of different color.
        // All basketball teams have a home uniform which they wear if they are on their
        // home arena. On the other hand, the guest uniform is worn by teams who are
        // visiting their opponent's arena.

        // Sometimes, the color of the guest uniform of the visiting team can be the
        // same color with the uniform of the home team. If this happens, the home
        // team will put on their guest uniform so that they would be different.

        // There are n teams taking part in the regular season. Elizer asked himself how
        // many times a home team will have to wear their guest uniform?

        // The regular season consists of n * ( n - 1) games. Each team will have a home
        // game and away game.
        // The color of the uniforms are represented by integers. No two distinct colors
        // can have the same number.
        // Help Elizer find the answer to his question!

        // Requirements
        // 1. Ask for the number of n teams participating.
        // 2. Ask for a pair of numbers, the home and away colors for each
        // participating team.
        // 3. The answer should be the number of times a home team will wear their away
        // uniform.

        // =============================================================
        // Example:
        // Input:
        // 3
        // 1 2
        // 2 4
        // 3 4

        // Answer
        // 1

        // Note: In this example, the season will have a total of six games.
        // There is game where team 2 will have to wear their guest uniform if team 1
        // visits their arena.
        
        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("12. Everybody has a price!");
        
        // Create a program and find out the condition to prove the following statements below.
        // ELIZER == ZOPHIA is TRUE
        // TONI > MARC is FALSE.
        
        // Input:
        // The first line is any name in UPPERCASE which only consists of characters from A-Z;
        // The second line is any name in UPPERCASE which only consists of characters from A-Z;
        
        // Output:
        // TRUE or FALSE
    }
}
