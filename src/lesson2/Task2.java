package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int number = 127;
        byte numberInByte = (byte) number;
        System.out.println(numberInByte);
        ++number;
        byte numberInByte2 = (byte) number;
        System.out.println(numberInByte2);
    }

}

