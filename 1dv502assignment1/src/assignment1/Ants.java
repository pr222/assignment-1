package assignment1;

import java.util.Random;

public class Ants {
    public static int simulation() {
        Random rnd = new Random();
        int antX = rnd.nextInt(8) + 1;
        int antY = rnd.nextInt(8) + 1;

        int[][] chessboard = new int[8][8];
        int sum = 0;
        int steps = 0;

        while (sum < 64) {
            // Update status of current position.
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i == antX - 1 && j == antY - 1) {
                        chessboard[i][j] = 1;
                        steps++;
                    }
                }
            }

            // Prepare next position.
            int[] pos = movement(antX, antY);
            antX = pos[0];
            antY = pos[1];          
            
            // Update how many unique tiles have been visited.
            sum = 0;
            for (int[] i: chessboard) {
                for (int j: i) {
                    sum += j;
                }
            }
        }

        return steps;
    }

    public static int[] movement(int x, int y) {
        Random rnd = new Random();
        int heading = rnd.nextInt(4) + 1;

        if (heading == 1) {
            if (x + 1 > 8) {
              movement(x, y);
            } else {
              x ++;  
            }
        } else if (heading == 2) {
            if (y + 1 > 8) {
              movement(x, y);
            } else {
              y ++;  
            }
        } else if (heading == 3) {
            if (x - 1 < 1) {
              movement(x, y);
            } else {
              x --;  
            }
        } else if (heading == 4) {
            if (y - 1 < 1) {
              movement(x, y);
            } else {
              y --;  
            }
        }

        int[] pos = {x, y};

        return pos;
    }
    public static void main(String[] args) {
        System.out.println("Ants\n=====\n");

        int totalSteps = 0;

        for (int i = 1; i <= 10; i++) {
            int steps = simulation();
            totalSteps += steps;
            System.out.println("Number of steps in simulation " + i + ": " + steps);
        }

        int averageSteps = totalSteps / 10;
        System.out.println("Average amount of steps: " + averageSteps);
    }
}
