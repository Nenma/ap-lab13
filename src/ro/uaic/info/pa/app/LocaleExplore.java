package ro.uaic.info.pa.app;

import ro.uaic.info.pa.com.DisplayLocales;
import ro.uaic.info.pa.com.Info;
import ro.uaic.info.pa.com.SetLocale;

import java.text.MessageFormat;
import java.util.*;

/**
 * Main class serving as a mini-shell: it waits for input command in a loop and executes them
 * until the 'exit' command is issued
 */
public class LocaleExplore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ResourceBundle bundle = ResourceBundle.getBundle("ro\\uaic\\info\\pa\\res\\Messages", Locale.getDefault());

        String com = "";
        while (!com.equals("exit")) {
            System.out.print(bundle.getString("prompt"));
            com = input.nextLine();

            if (com.equals("display locales")) {
                System.out.println(bundle.getString("locales"));
                DisplayLocales.INSTANCE.execute();
            } else if (com.matches("set locale [a-z]{2}-[A-Z]{2}")) {
                String localeString = Arrays.asList(com.split(" ")).get(2);
                Locale locale = Locale.forLanguageTag(localeString);
                SetLocale.INSTANCE.execute(locale);
                System.out.println(MessageFormat.format(bundle.getString("locale.set"), locale));
            } else if (com.matches("info [a-z]{2}-[A-Z]{2}")) {
                String localeString = Arrays.asList(com.split(" ")).get(1);
                Locale locale = Locale.forLanguageTag(localeString);
                System.out.println(MessageFormat.format(bundle.getString("info"), locale));
                Info.INSTANCE.execute(locale);
            } else {
                if (!com.equals("exit")) {
                    System.out.println(bundle.getString("invalid"));
                }
            }
        }
    }
}
