package ro.uaic.info.pa.com;

import java.util.Locale;

/**
 * Singleton that models the 'display locales' command: it iterates through all the available locales
 * and outputs their country's name
 */
public enum DisplayLocales {

    INSTANCE;

    private final Locale[] available;

    DisplayLocales() {
        available = Locale.getAvailableLocales();
    }

    public void execute() {
        for (Locale locale : available) {
            System.out.println(locale.getDisplayCountry() + " " + locale.getDisplayCountry(locale));
        }
    }

}
