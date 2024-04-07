import java.util.HashMap;
import java.util.Scanner;

public class CountryCapitalManager {
    private HashMap<String, String> countryCapitalMap;
    private Scanner scanner;

    public CountryCapitalManager() {
        countryCapitalMap = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Search");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCountryCapital();
                    break;
                case 2:
                    searchForCapital();
                    break;
                case 3:
                    System.out.println("Thank you for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private void addCountryCapital() {
        System.out.print("Enter the country name: ");
        String country = scanner.nextLine();
        System.out.print("Enter the capital name: ");
        String capital = scanner.nextLine();
        countryCapitalMap.put(country, capital);
        System.out.println("Country-capital pair added successfully.");
    }

    private void searchForCapital() {
        System.out.print("Enter the country name: ");
        String country = scanner.nextLine();
        String capital = countryCapitalMap.get(country);
        if (capital != null) {
            System.out.println("Capital of " + country + " is " + capital);
        } else {
            System.out.println("Capital not found for " + country);
        }
    }

    public static void main(String[] args) {
        CountryCapitalManager manager = new CountryCapitalManager();
        manager.start();
    }
}
