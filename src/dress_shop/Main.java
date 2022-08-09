package dress_shop;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static {

        DataBase.createDataBase();
    }

    public static void main(String[] args) {

        System.out.println(calculateProfit(StaticConstants.DRESS_LIST, soldDressCountForWeek()));
    }

    private static int[] soldDressCountForWeek(){

        System.out.println("Please enter the daily sold dress counts");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int[] counts = new int[7];

        for (int i = 0; i < 7; i++) {

            System.out.println(days[i] + ":");

            counts[i] = new Scanner(System.in).nextInt();
        }

        return counts;
    }

    private static double calculateProfit(Stack<Dress> dresses, int[] soldDressCounts){

        int soldDress = 0;

        for (int soldDressCount : soldDressCounts) {

            soldDress += soldDressCount;
        }

        final int dressSize = dresses.size();

        double profit = 0;

        for (int i = 0; i < dressSize; i++) {

            if (i < soldDress){

                profit += dresses.pop().getProfit();
            }else profit -= dresses.pop().getWholesalerPrice();
        }

        return profit;
    }
}
