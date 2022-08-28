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
}