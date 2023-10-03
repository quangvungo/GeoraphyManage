package View;

import Controller.ManageEastAsiaCountries;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Menu<String> {

    public static Scanner sc = new Scanner(System.in);
    static String[] mc = {"Input the information of 11 countries in East Asia", "Display the information of country you've just input", "Search the information of country by user-entered name", "Display the information of countries sorted name in ascending order", "Exit"};
    protected ManageEastAsiaCountries managers;

    public Manager() {
        super("MENU", mc);
        managers = new ManageEastAsiaCountries();
    }

    @Override
    public void execute(String n) {
        switch (n) {
            case "1" -> managers.addCountryInformation();
            case "2" -> managers.getRecentlyEnteredInformation();
            case "3" -> searchName();
            case "4" -> managers.sortCountriesByFirstCharacter();
            case "5" -> System.exit(0);
        }
    }

    private void searchName() {
        System.out.println("Enter country name:");
        String name = Validation.checkInputString();
        managers.searchByName(name);
    }
}