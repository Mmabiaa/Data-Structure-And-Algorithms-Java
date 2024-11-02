public class Main_Array {
    public static void main(String[] args) {
        //Arrays
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Element at index 0:" + array[0]);
        System.out.println("Element at index 2:" + array[2]);
        System.out.println("Element at index 4:" + array[4]);

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum =+ array[i];
        }
        System.out.println("Sum of Array elements: " + sum);

        array[2] = 35;
        System.out.println("Updated element at index 2: " + array[2]);

        System.out.println("Element in the Array: " );

        for(int i:array ){
            System.out.println(i);
        }
    }
}
