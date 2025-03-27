public class App {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        int[] arr3 = { -3, -1, 0, 2, 4, 6, 10 };

        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr3));

        System.out.println(contains(arr2, 6));

        System.out.println(convertirABinario(6));
        System.out.println(toBinary(6));

        System.out.println(fibonacci(50));

        // System.out.println(hasSameValueAIndex(arr2));
    }

    // EJ 1
    // 1. Complejidad O(1+n) que es equivalente a O(n)
    // 2. Creo que no, solo que hubo que hacer dos metodos para que funcione
    // 3. No se

    public static boolean isSorted(int[] arr) {
        return sorted(arr, 0);
    }

    public static boolean sorted(int[] arr, int i) {
        if (i < arr.length - 1) {
            return arr[i] < arr[i + 1] && sorted(arr, i + 1);
        } else {
            return true;
        }
    }
    
    // EJ 2
    // Deberia implementar una busqueda binaria

    public static boolean contains(int[] arr, int nro) {
        return search(arr, nro, 0);
    }

    public static boolean search(int[] arr, int nro, int i) {

        if (i >= arr.length || arr[i] > nro) {
            return false;
        } else {
            return arr[i] == nro || search(arr, nro, i + 1);
        }

    }

    // EJ 3

    // OPCION 1
    public static String convertirABinario(int numero) {
        if (numero == 0) return "0";
        if (numero == 1) return "1";
        return convertirABinario(numero / 2) + (numero % 2);
    }

    //OPCION 2
    public static String toBinary(double num) {
        String res = "";
        res = appendDigit(res, num);
        return res;
    }

    public static String appendDigit(String concatenated, double num) {
        int digit = (int) num % 2;
        if (num >= 1) {
            concatenated += (appendDigit(concatenated, num / 2)) + digit;
        }
        return concatenated;
    }

    // EJ 4

    public static String fibonacci(int n) {
        String res = "";

        if (n <= 1) return res = "0";
        if (n == 2) return res = "0 1";

        res = fib(n, 1, 0);
        return res;
    }

    // Seguir por aca, EJ 5

    public static String fib(int counter, int actual, int prev) {

        if (counter > 0) {
            return prev + " " + fib(counter - 1, actual + prev, actual);
        } else {
            return "";
        }

    }

    public static boolean hasSameValueAIndex(Integer[] arr) {

        return sameValue(arr, 0);
    }

    public static boolean sameValue(Integer[] arr, int i) {
        if (i > arr.length || arr[i] > (i)) {
            return false;
        }

        return i == arr[i] || sameValue(arr, i + 1);

    }
}