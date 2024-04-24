package com.example.oblig3;

public class Billett {
    private String fornavn;
    private String etternavn;
    private int antall;
    private String film;
    private String telefonnr;
    private String epost;

    public Billett(String fornavn, String etternavn, int antall, String film, String telefonnr, String epost) {
        this.antall = antall;
        this.etternavn = etternavn;
        this.epost = epost;
        this.film = film;
        this.fornavn = fornavn;
        this.telefonnr = telefonnr;
    }

    public Billett() {}

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public int getAntall() {
        return antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getEpost() {
        return epost;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getFilm() {
        return film;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr() {
        return telefonnr;
    }
}
