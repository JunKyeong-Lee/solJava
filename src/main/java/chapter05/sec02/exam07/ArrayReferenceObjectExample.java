package chapter05.sec02.exam07;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "123";
        arr[1] = "123";
        arr[2] = new String("123");

        System.out.println(arr[0] == arr[1]); // true
        System.out.println(arr[0] == arr[2]); // false
        System.out.println(arr[0].equals(arr[2])); // true
    }
}
