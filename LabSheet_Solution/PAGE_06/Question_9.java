package LabSheet_Solution.PAGE_06;

public class Question_9 {
    public static void main(String[] args) {
        System.out.print("The prime numbers between 1 and 100 are: ");
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            }
            else {
                for (int j = 2; j*j <= i; j++) {
                    if (i%j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i+" ");
            }
        }
    }
}