import java.util.Scanner;

public class myLibrary {

    /**
    * Tar in 2 stycken heltal och returnerar sen det minsta av de två talen.
    * @param a ett heltal
    * @param b ett heltal
    * @return Det minsta av a och b
    */
    public static int min(int a, int b) {
        if(a < b) return a;
        return b;
    }

    /**
    * Tar in 2 stycken heltal och returnerar sen det största av de två talen.
    * @param a ett heltal
    * @param b ett heltal
    * @return Det största av a och b
    */
    public static int max(int a, int b) {
        if(a > b) return a;
        return b;
    }

    /**
    * Tar in en sträng, vänder på den och returnerar den sen baklänges.
    * @param str en sträng
    * @return str baklänges
    */
    public static String reverse(String str) {
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    /**
    * Tar in ett heltal och returnerar heltalets tiotal.
    * @param i ett heltal
    * @return Variabelns tiotal
    */
    public static int tiotal(int i) {
        return (i % 100) / 10;
    }

    /**
    * Tar in en array av heltal och sorterar den i storleksordning.
    * Använder sig av quicksort algoritmen för att sortera arrayen.
    * @param arr en array av heltal
    * @return En sorterad version av den originella arrayen.
    */
    public static int[] sort(int[] arr) {
        int n = 1;
        while(n < arr.length) {
            //fortsätter till arr.length - k så att den inte går utanför arrayens index
            for(int i = 0; i < arr.length - n; i++) {
                int temp;
                if (arr[i] > arr[i + 1]) {
                    // Om arr[i] är större än arr[i + 1] så byter deras värden plats
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            //efter varje loop så är det n:e största talet sorterat (är på plats arr.length - n i arrayen)
            n++;
        }
        return arr;
    }

    /**
    * Tar in ett heltal, vänder på det och returnerar den sen baklänges.
    * Använder sig av string reverse() metoden.
    * @param i ett heltal
    * @return i baklänges
    */
    public static int reverse(int i) {
        return Integer.parseInt(reverse(String.valueOf(i)));
    }


    /**
    * Tar in ett heltal, och returnerar dens fakultet.
    * @param i ett heltal
    * @return Fakulteten till variabeln i
    */
    public static int fakultet(int i) {
        int j = 1;
        for(int k = 1; k <= i; k++) {
            j *= k;
        }
        return j;
    }

    /**
    * Frågar användaren efter dess namn och returnerar sen det.
    * @return De namnet som användaren skrev in
    */
    public static String askForName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ditt namn: ");
        return scanner.nextLine();
    }

    /**
    * Tar in en array av tal och returnerar det högsta talet.
    * @param arr en array av tal
    * @return Det största talet i arrayen.
    */
    public static double max(double[] arr) {
        double max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    /**
    * Tar in ett tecken c och en sträng, som sen räknar hur många gånger tecknet förekommer i strängen
    * @param c ett tecken
    * @param str en sträng
    * @return Antalet gånger tecknet c förekommer i strängen str
    */
    public static int count(char c, String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) count++;
        }
        return count;
    }

    /**
    * Tar in ett vattendjup och returnar trycket vid det djupet.
    * Använder formeln (rå) pgh. Atmosfärens lufttryck är ej inkluderat.
    * @param depth ett tal (djupet)
    * @return Vattentrycket från vattenytan till depth under vattnet.
    */
    public static double pressureUnderWater(double depth) {
        return 998 * 9.82 * depth;
    }

    /**
    * Tar in en höjd och returnerar den maximala hastigheten
    * som ett föremål kan uppna ifall den får falla fritt
    * ifrån höden utan luftmotstånd.
    * Använder sig ut av formlen sqrt(2gh)
    * @param height ett tal (djupet)
    * @return Vattentrycket från vattenytan till depth under vattnet.
    */
    public static double fallSpeed(double height) {
        return Math.sqrt(2*9.82*height);
    }

    /**
    * Tar in en temperatur i fahrenheit, omvandlar den till celsius och returnerar den.
    * @param fahrenheit en temperatur i fahrenheit
    * @return Temperaturen fahrenheit som har blivit omvandlad till celsius.
    */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
    * Tar in en temperatur i kelvin, omvandlar den till celsius och returnerar den.
    * @param kelvin en temperatur i kelvin
    * @return Temperaturen kelvin som har blivit omvandlad till celsius.
    */
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    /**
    * Tar in en vatten volym, en start temperatur och en slut temperatur,
    * som sen används för att räkna ut hur mycket energi som krävs för att
    * värma upp vattnet till en viss temperatur. Använder sig utav formeln cmΔt
    * @param volume volymen på vattnet som man vill värma upp i
    * @param startDeg vattnets start temperatur
    * @param endDeg vattnets slut temperatur
    * @return Antal energi som behövs för att värma upp en viss volym vatten till en viss temperatur.
    */
    public static double heatWater(double volume, double startDeg, double endDeg) {
        return 4180 * volume * Math.abs(startDeg - endDeg);
    }

    /**
    * Tar in en temperatur i kelvin, omvandlar den till celsius och returnerar den.
    * @param i ett heltal
    * @return Om heltalet i är ett primtal eller inte (sant/falskt).
    */
    public static boolean isPrim(int i) {
        for(int j = i - 1; j > 1; j--) {
            if(i % j == 0) return false;
        }
        return true;
    }
}
