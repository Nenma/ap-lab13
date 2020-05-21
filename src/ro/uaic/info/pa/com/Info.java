package ro.uaic.info.pa.com;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public enum Info {

    INSTANCE;

    public void execute(Locale locale) {
        System.out.println("Country: " + locale.getDisplayCountry() + " (" + locale.getDisplayCountry(locale) + ")");
        System.out.println("Language: " + locale.getDisplayLanguage() + " (" + locale.getDisplayLanguage(locale) + ")");
        System.out.println("Currency: " + Currency.getInstance(locale).getSymbol() + " (" + Currency.getInstance(locale).getDisplayName() + ")");
        System.out.println("Week days: " + Arrays.toString(DateFormatSymbols.getInstance(locale).getWeekdays()));
        System.out.println("Months: " + Arrays.toString(DateFormatSymbols.getInstance(locale).getMonths()));
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMM yyyy", locale);
        System.out.println("Today: " + sdf1.format(new Date()) + " (" + sdf2.format(new Date()) + ")");
    }

}
