package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Hex2Dec {
    public static ArrayList<Integer> convertHexesToNumbers(String hex) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < hex.length(); i++) {
            if (hex.charAt(i) == '1') {
                list.add(1);
            } else if (hex.charAt(i) == '2') {
                list.add(2);
            } else if (hex.charAt(i) == '3') {
                list.add(3);
            } else if (hex.charAt(i) == '4') {
                list.add(4);
            } else if (hex.charAt(i) == '5') {
                list.add(5);
            } else if (hex.charAt(i) == '6') {
                list.add(6);
            } else if (hex.charAt(i) == '7') {
                list.add(7);
            } else if (hex.charAt(i) == '8') {
                list.add(8);
            } else if (hex.charAt(i) == '9') {
                list.add(9);
            } else if (hex.toUpperCase().charAt(i) == 'A') {
                list.add(10);
            } else if (hex.toUpperCase().charAt(i) == 'B') {
                list.add(11);
            } else if (hex.toUpperCase().charAt(i) == 'C') {
                list.add(12);
            } else if (hex.toUpperCase().charAt(i) == 'D') {
                list.add(13);
            } else if (hex.toUpperCase().charAt(i) == 'E') {
                list.add(14);
            } else if (hex.toUpperCase().charAt(i) == 'F') {
                list.add(15);
            }
        }   
        
        return list;
    }

    public static int hexToDecimal(String hex) {
        int decimals = 0;

        ArrayList<Integer> list = convertHexesToNumbers(hex);

        for (int i = 0; i < list.size(); i++) {
            double number = list.get(i);
            
            number = number * Math.pow(16, (list.size() - i) - 1);

            decimals += number;
        }

        return decimals;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hexInput = scan.next();

        int asDecimal = hexToDecimal(hexInput);
        System.out.println("The decimal value for " + hexInput + " is " + asDecimal);

        scan.close();
    }
}
