package ro.uaic.info.pa.com;

import java.util.Locale;

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
