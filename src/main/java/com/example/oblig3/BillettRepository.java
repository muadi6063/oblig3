package com.example.oblig3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillettRepository {

    @Autowired
    private JdbcTemplate db;


    public void lagreBillett(Billett billett) {
        String sql = "INSERT INTO Billett (fornavn, etternavn, antall, film, telefonnr, epost) VALUES (?, ?, ?, ?, ?, ?)";
        db.update(sql,billett.getFornavn(), billett.getEtternavn(), billett.getAntall(), billett.getFilm(),
                billett.getTelefonnr(), billett.getEpost());
    }


    public List<Billett> hentAlle() {
        String sql = "SELECT * FROM Billett ORDER BY etternavn";
        return db.query(sql, new BeanPropertyRowMapper(Billett.class));
    }
    public void slettAlle() {
        String sql = "DELETE FROM Billett";
        db.update(sql);
    }
}
