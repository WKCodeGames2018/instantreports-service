package codegames.codefiction.instantreportsservice.rest.model;

import codegames.codefiction.instantreportsservice.tools.LocalDateXmlAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

public class InstantMessage {

    private String name;

    private String surname;

    private String socialSecurityNo;

    private String locationNo;

    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    private Date entryDate;

    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    private Date sendOn;

    private String fileName;
}
