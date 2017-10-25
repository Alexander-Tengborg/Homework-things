import java.util.Scanner;

public class myLibrary {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int min(int a, int b) {
        if(a < b) return a;
        return b;
    }

    public static int max(int a, int b) {
        if(a > b) return a;
        return b;
    }

    public static String reverse(String str) {
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    //REDO - FIX
    public static int tiotal(int i) {
        if(i < 10) return -1;
        String number = String.valueOf(i);
        i = Character.getNumericValue(number.charAt(number.length() - 2));
        return i;
    }

    //FIX - uses bubblesort
    public static int[] sort(int[] arr) {
        int k = 1;
        while(k < arr.length) {
            for(int i = 0; i < arr.length - k; i++) {
                int temp;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            k++;
        }

        /*for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        return arr;
    }

    public static int reverse(int i) {
        return Integer.parseInt(reverse(String.valueOf(i)));
    }

    public static int fakultet(int i) {
        int j = 1;
        for(int k = 1; k <= i; k++) {
            j *= k;
        }
        return j;
    }

    public static String askForName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ditt namn: ");
        return scanner.nextLine();
    }

    public static double max(double[] arr) {
        double max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int count(char c, String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) count++;
        }
        return count;
    }

    //tryck = PGH - densitet * gravitation * höjd/djup = vattnets tryck (atmosfärens tryck är ej inkluderat (+ca 101,3))
    public static double pressureUnderWater(double depth) {
        return 1000 * 9.82 * depth;
    }

    //-gt + v = -gravitation *
    public static double fallSpeed(double height) {
        return height;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    //E = CM <>T = Vatten spec. värmekap. * massa * delta temp.
    public static double heatWater(double volume, double startDeg, double endDeg) {
        return 4190 * volume * 1000 * (startDeg - endDeg);
    }

    public static boolean isPrim(int i) {
        for(int j = i - 1; j > 1; j--) {
            if(i % j == 0) return false;
        }
        return true;
    }
}
