public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i <= array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println(array[5]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}