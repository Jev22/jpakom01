package com.example.jpakom01.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kommune {


    @Id
    private Integer kommuneKode;
    private String navn;


    public Kommune() {
    }

    public Integer getKommuneKode() {
        return kommuneKode;
    }

    public void setKommuneKode(Integer kommuneKode) {
        this.kommuneKode = kommuneKode;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Kommune{" +
                "kommuneKode=" + kommuneKode +
                ", navn='" + navn + '\'' +
                '}';
    }


}
