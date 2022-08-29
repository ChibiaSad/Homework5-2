import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] costArr = randomArray(30);
        int costSum = 0;
        int maxCost = 0, minCost = 200000;
        double averageCost;
        for (int cost : costArr) {
            //task 1
            costSum += cost;
            //task 2
            if(cost > maxCost){
                maxCost = cost;
            }
            if(cost < minCost){
                minCost = cost;
            }
        }
        //task 3
        averageCost = costSum * 1.0 / costArr.length;
        System.out.printf("Сумма трат за месяц составила %d рублей\nМаксимальная трата %d рублей\nМинимальная трата %d рублей\nСредняя сумма трат за месяц составила %.2f рублей",
                costSum, maxCost, minCost, averageCost);

        //task 4
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        bugChecker(reverseFullName);
        char[] fullName = {'I', 'v', 'a', 'n', ' ', 'I', 'v', 'a', 'n', 'o', 'v'};
        bugChecker(fullName);

        //усложненные задачи
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void bugChecker(char[] arr){
        if(Character.isUpperCase(arr[arr.length -1])){
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            for (char c : arr) {
                System.out.print(c);
            }
        }
        System.out.println();
    }

    public static int[] randomArray(int length){
        int[] randomArr = new int[length];
        Random random = new Random();
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(100000) + 100000;
        }
        return randomArr;
    }

    public static void task5(){
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j || i + j == matrix.length - 1){
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6(){
        int[] digits = {5, 4, 3, 2, 1};
        int[] reserved = new int[digits.length];
        System.out.println(Arrays.toString(digits));
        for (int i = 0; i < digits.length; i++) {
            reserved[i] = digits[digits.length - i - 1];
        }
        System.out.println(Arrays.toString(reserved));
    }

    public static void task7(){
        int[] digits = {5, 4, 3, 2, 1, 8, 9, 6};
        System.out.println(Arrays.toString(digits));
        int buff;
        for (int i = 0; i < digits.length / 2; i++) {
            buff = digits[i];
            digits[i] = digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = buff;
        }
        System.out.println(Arrays.toString(digits));
    }

    public static void task8(){
        int[] digits = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < digits.length; i++) {
            for (int j = i; j < digits.length; j++) {
                if(digits[i] + digits[j] == -2){
                    System.out.println(digits[i] + " + " + digits[j] + " = " + (digits[i] + digits[j]));
                }
            }
        }
    }
}