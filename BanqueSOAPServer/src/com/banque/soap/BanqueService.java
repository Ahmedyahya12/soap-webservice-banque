package com.banque.soap;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion(double montant) {
        return montant * 10; // simple conversion
    }

    @WebMethod
    public Compte getCompte() {
        return new Compte(1, 5000);
    }

    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 1000));
        comptes.add(new Compte(2, 2000));
        return comptes;
    }
}