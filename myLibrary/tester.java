import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in två stycken heltal: ");
        int i1 = Integer.parseInt(sc.nextLine());
        int i2 = Integer.parseInt(sc.nextLine());
        System.out.println("Det minsta talet är " + myLibrary.min(i1, i2));
        System.out.println("---");

        System.out.println("Skriv in ett heltal");
        int primtal = Integer.parseInt(sc.nextLine());
        boolean isPrim = myLibrary.isPrim(primtal);
        if(isPrim) {
            System.out.println(primtal + " är ett primtal.");
        } else {
            System.out.println(primtal + " är inte ett primtal.");
        }
        System.out.println("---");
        System.out.println("Skriv in en volym på vatten och två stycken temperaturer i Fahrenheit");
        int volym = Integer.parseInt(sc.nextLine());
        double t1 = myLibrary.fahrenheitToCelsius(Double.parseDouble(sc.nextLine()));
        double t2 = myLibrary.fahrenheitToCelsius(Double.parseDouble(sc.nextLine()));
        System.out.println(myLibrary.heatWater(volym, t1, t2));
        System.out.println("---");

        System.out.println("Vad heter du?");
        String namn = sc.nextLine();
        System.out.println("Ditt namn baklänges blir " + myLibrary.reverse(namn));
        System.out.println("---");

        //Står heltal i uppgiften, men myLibrary.max() metoden funkar endast med double arrays
        System.out.println("Skriv in 5 stycken tal");
        double arr[] = new double[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Det högsta talet är " + myLibrary.max(arr));
        System.out.println("---");

        System.out.println("Skriv in ett heltal");
        int fakultet = Integer.parseInt(sc.nextLine());
        System.out.println("Värdet på talet " + fakultet + " i fakultet är " + myLibrary.fakultet(fakultet));
        System.out.println("---");

        //Behöver ej vikt
        System.out.println("Skriv in en höjd");
        double height = Double.parseDouble(sc.nextLine());
        System.out.println("Den maximala hastigheten som ett föremål kan uppnå (där det inte finns luftmotstånd) är " + myLibrary.fallSpeed(height) + " km/h");
        System.out.println("---");

        System.out.println("Skriv in ett heltal över 10");
        int tal = Integer.parseInt(sc.nextLine());;
        System.out.println("Tiotalet i talet " + tal + " Är " + myLibrary.tiotal(tal));
        System.out.println("---");

        System.out.println("Skriv in 8 stycken heltal");
        int arr2[] = new int[8];
        for(int i = 0; i < 8; i++) {
            arr2[i] = Integer.parseInt(sc.nextLine());;
        }
        arr2 = myLibrary.sort(arr2);
        System.out.println("Samma tal fast i storleksordning: ");
        for(int i = 0; i < 8; i ++) {
            System.out.println(arr2[i]);
        }
        System.out.println("---");

        System.out.println("Skriv in en temperatur i Kelvin");
        double kelvin = Double.parseDouble(sc.nextLine());
        System.out.println(kelvin + " grader Kelvin är " + myLibrary.kelvinToCelsius(kelvin) + " grader Celsius");
    }
}
