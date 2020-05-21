package ro.uaic.info.pa.com;

import java.util.Locale;

/**
 * Singleton that models the 'set locale' command: it sets the default locale to the specified one
 */
public enum SetLocale {

    INSTANCE;

    public void execute(Locale locale) {
        Locale.setDefault(locale);
    }

}
