public class addsub {
     public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] result = new int[array1.length];

        // Addition
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        System.out.println("Addition result:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Subtraction
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        System.out.println("Subtraction result:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
