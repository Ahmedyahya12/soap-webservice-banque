package com.banque.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BanqueService {
    
    @WebMethod
    double conversion(double montant);
    
    @WebMethod
    Compte getCompte();
    
    @WebMethod
    List<Compte> getComptes();
}