package com.example.oblig3;

import com.example.oblig3.BillettRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KinoBillettController {

    @Autowired
    BillettRepository rep;

    @PostMapping("/lagreBillett")
    public void lagreBillett(Billett billett) {
        rep.lagreBillett(billett);
    }

    @GetMapping("/hentAlle")
    public List<Billett> hentAlle() {
        return rep.hentAlle();
    }
    @GetMapping("/slett")
    public void slettAlle() {
        rep.slettAlle();
    }
}
