package Infosys;

import java.util.Scanner;

public class ChessPiecePlacement {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // input first piece
        int x1_min = sc.nextInt();
        int x1_max = sc.nextInt();
        int y1_min = sc.nextInt();
        int y1_max = sc.nextInt();

        //input second piece
        int x2_min = sc.nextInt();
        int x2_max = sc.nextInt();
        int y2_min = sc.nextInt();
        int y2_max = sc.nextInt();

        // iteration over all positions of 1st piece
        for(int x1 = x1_min; x1 <= x1_max; x1++) {
            for(int y1 = y1_min; y1 <= y1_max; y1++) {

                // iteration over all positions of 2nd piece
                for(int x2 = x2_min; x2 <= x2_max; x2++) {
                    for(int y2 = y2_min; y2 <= y2_max; y2++) {

                        // check if pieces are of same color cell
                        boolean sameColor = (x1 + y1) % 2 == (x2 + y2) % 2;

                        // ensure 2 pieces are not on same cell
                        if(sameColor && (x1 != x2) || (y1 != y2)) {
                            count++;
                        }

                    }
                }
            }
        }

        System.out.println(count);
    }
}
