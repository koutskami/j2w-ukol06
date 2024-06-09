package cz.czechitas.java2webapps.ukol6.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class Vizitka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Length(max = 100)
    @NotBlank
    String cele_jmeno;
    @Length(max = 100)
    @NotBlank
    String ulice;
    @Length(max = 100)
    @NotBlank
    String obec;
    @Pattern(regexp = "\\d{5}")
    @NotBlank
    String psc;
    @Length(max = 100)
    @Email
    String email;
    @Length(min = 9, max = 13)
    @Pattern(regexp = "\\+?\\d+")
    String telefon;
    @Length(max = 100)
    String web;

    public Vizitka() {
    }
    public Vizitka(int id, String cele_jmeno, String ulice, String obec, String psc, String email, String telefon, String web) {
        this.id = id;
        this.cele_jmeno = cele_jmeno;
        this.ulice = ulice;
        this.obec = obec;
        this.psc = psc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCele_jmeno() {
        return cele_jmeno;
    }

    public void setCele_jmeno(String cele_jmeno) {
        this.cele_jmeno = cele_jmeno;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCelaAdresa(){
        return (ulice + ", " + psc + " " + obec);
    }
}
