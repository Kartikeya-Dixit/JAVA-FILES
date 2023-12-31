import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int num, count;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers between 10 and 100: ");

        for (int i = 0; i < SIZE; i++) {
            do {
                count = 0;
                num = input.nextInt();
                if (num < 10 || num > 100) {
                    System.out.println("Error: number must be between 10 and 100. Please enter again: ");
                } else {
                    for (int j = 0; j < i; j++) {
                        if (numbers[j] == num) {
                            count++;
                        }
                    }
                    if (count == 0) {
                        numbers[i] = num;
                        for (int k = 0; k <= i; k++) {
                            System.out.print(numbers[k] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Error: number is a duplicate. Please enter again: ");
                    }
                }
            } while (count != 0);
        }
    }
}
