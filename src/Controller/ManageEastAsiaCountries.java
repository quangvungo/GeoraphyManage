package Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

import Model.EastAsiaCountries;
import View.Validation;

public class ManageEastAsiaCountries {
    Scanner sc = new Scanner(System.in);
    ArrayList<EastAsiaCountries> countryList = new ArrayList<EastAsiaCountries>();
    public void getRecentlyEnteredInformation() {
        EastAsiaCountries recentlyEnteredCountry = countryList.get(countryList.size() - 1);
        if ( recentlyEnteredCountry != null) {
            System.out.println("Recently entered country information:");
            System.out.println(recentlyEnteredCountry.toString());
        } else {
            System.out.println("No country has been recently entered.");
        }
    }
    public void addCountryInformation() {
        System.out.println("Enter country code:");
        String code = Validation.checkInputString();
        System.out.println("Enter country name:");
        String name = Validation.checkInputString();
        System.out.println("Enter total area:");
        float area = Validation.checkInputFloatGreaterThanZero();
        
        System.out.println("Enter terrain:");
        String terrain = Validation.checkInputString()  ;

        EastAsiaCountries newCountry = new EastAsiaCountries(code, name, area, terrain);
        countryList.add(newCountry);
        System.out.println("Country added successfully.");
    }
    public void searchByName(String name) {
        Predicate<EastAsiaCountries> namePredicate = country -> country.getCountryName().equalsIgnoreCase(name);
        ArrayList<EastAsiaCountries> matchingCountries =  search(namePredicate);

        if (!matchingCountries.isEmpty()) {
            System.out.println("Matching countries:");
            for (EastAsiaCountries country : matchingCountries) {
                System.out.println(country.toString());
            }
        } else {
            System.out.println("No countries found with the given name.");
        }
    }

    // Method to search countries based on a provided predicate
    public ArrayList<EastAsiaCountries> search(Predicate<EastAsiaCountries> predicate) {
        ArrayList<EastAsiaCountries> matchingCountries = new ArrayList<>();
        for (EastAsiaCountries country : countryList) {
            if (predicate.test(country)) {
                matchingCountries.add(country);
            }
        }
        return matchingCountries;
    }
    public void sortCountriesByFirstCharacter() {
        Collections.sort(countryList);
        displayCountries();

    }
    public void displayCountries() {
        for (EastAsiaCountries country : countryList) {
            System.out.println(country.toString());
        }
    }

}
