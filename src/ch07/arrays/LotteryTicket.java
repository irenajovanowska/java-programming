package ch07.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/* Create a lottery quick pick app
 * that will generate a lottery ticket with 6 random numbers within 1-69
 * Update the lottery ticket class to ensure the ticket does not have any duplicate numbers
 */
public class LotteryTicket {
    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i < LENGTH; i++) {
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }
            while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearch) {
        for(int value : array) {
            if(value == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public static boolean booleanSearch(int[] array, int numberToSearch) {
        //Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearch);
        if(index >= 0) {
            return true;
        } else
            return false;
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + ", ");
        }
    }
}
