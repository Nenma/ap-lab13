package ro.uaic.info.pa.com;

import java.util.Locale;

public enum SetLocale {

    INSTANCE;

    public void execute(Locale locale) {
        Locale.setDefault(locale);
    }

}
