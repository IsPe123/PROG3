public class App {
    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 1, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        int[] arr3 = { 3, -1, 0, 2, 10, 4, 7 };

        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr3));

        System.out.println(contains(arr2, 6));

        System.out.println(convertirABinario(6));
        System.out.println(toBinary(6));

        System.out.println(fibonacci(50));

        System.out.println(coinciden(arr3));

        ordenarBurbujeo(arr3);
        imprimirArreglo(arr3);
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
        if (numero == 0)
            return "0";
        if (numero == 1)
            return "1";
        return convertirABinario(numero / 2) + (numero % 2);
    }

    // OPCION 2
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

        if (n <= 1)
            return res = "0";
        if (n == 2)
            return res = "0 1";

        res = fib(n, 1, 0);
        return res;
    }

    public static String fib(int counter, int actual, int prev) {

        if (counter > 0) {
            return prev + " " + fib(counter - 1, actual + prev, actual);
        } else {
            return "";
        }

    }

    // EJ 5

    public static boolean coinciden(int[] arr) {
        int i = 0;
        return coincidenRecorrer(arr, i);
    }

    public static boolean coincidenRecorrer(int[] arr, int i) {
        if (arr.length > i) {
            if (arr[i] == i) {
                return true;
            } else {
                return coincidenRecorrer(arr, ++i);
            }
        }
        return false;
    }


    // EJ 6

    public static void ordenarBurbujeo(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

    }

    public static void imprimirArreglo(int[] arr) {
        String salida = "";
        for (int i : arr) {
            salida = salida + " " + i;           
        }
        System.out.println(salida);
    } 
}