package codegames.codefiction.instantreportsservice.rest.model;

import codegames.codefiction.instantreportsservice.tools.LocalDateXmlAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class InstantMessage {

    private String name;

    private String surname;

    private String socialSecurityNo;

    private String locationNo;

    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    private LocalDate entryDate;

    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    private LocalDate sendOn;

    private String fileName;

    public String getName() {
        return name;
    }

    public InstantMessage setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public InstantMessage setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    public InstantMessage setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
        return this;
    }

    public String getLocationNo() {
        return locationNo;
    }

    public InstantMessage setLocationNo(String locationNo) {
        this.locationNo = locationNo;
        return this;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public InstantMessage setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
        return this;
    }

    public LocalDate getSendOn() {
        return sendOn;
    }

    public InstantMessage setSendOn(LocalDate sendOn) {
        this.sendOn = sendOn;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public InstantMessage setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
}
