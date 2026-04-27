package LabSheet_Solution.PAGE_02;

public class Question_4 {
    public static void main(String[] args) {
        int x = 123;
        int d1 = x % 10;
        x /= 10;
        int d2 = x % 10;
        x /= 10;
        int d3 = x % 10;
        int sum = d1 + d2 + d3;
        System.out.println(sum);
    }
}