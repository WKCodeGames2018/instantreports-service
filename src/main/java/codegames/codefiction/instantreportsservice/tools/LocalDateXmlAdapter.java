package codegames.codefiction.instantreportsservice.tools;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateXmlAdapter extends XmlAdapter<String, LocalDate> {

    public static LocalDate convert(String v) {
        if (v == null || "".equals(v)) {
            return null;
        } else {
            // Ist es ein gültiges ISO-Format, welches als zusätzliche Info auch noch Stunden enthält? Das tolerieren wir
            // Das Datum wird von der Stundenabgabe gemäß ISO-Standard durch ein 'T' getrennt
            DateTimeFormatter formatter = v.contains("T") ? DateTimeFormatter.ISO_LOCAL_DATE_TIME : DateTimeFormatter.ISO_LOCAL_DATE;

            try {
                return LocalDate.parse(v, formatter);
            } catch (DateTimeParseException e) {

            }
        }

        return null;
    }

    public static String convert(LocalDate v) {
        return v.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @Override
    public String marshal(LocalDate v) {
        return convert(v);
    }

    @Override
    public LocalDate unmarshal(String v) {
        return convert(v);
    }
}
