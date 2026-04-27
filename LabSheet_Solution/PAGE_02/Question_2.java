package LabSheet_Solution.PAGE_02;

public class Question_2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 50;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        int z = x;
        x = y;
        y = z;
        System.out.println("After swap:");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}