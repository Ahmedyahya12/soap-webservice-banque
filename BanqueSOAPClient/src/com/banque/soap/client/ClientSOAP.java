package com.banque.soap.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.banque.soap.BanqueService;
import com.banque.soap.Compte;

public class ClientSOAP {
    public static void main(String[] args) {
        try {
            // URL du WSDL
            URL url = new URL("http://localhost:9001/BanqueService?wsdl");
            
            // QName du service (namespace + nom du service)
            QName qname = new QName("http://soap.banque.com/", "BanqueServiceService");
            
            // Créer le service
            Service service = Service.create(url, qname);
            
            // Obtenir le proxy
            BanqueService proxy = service.getPort(BanqueService.class);
            
            // ===== TESTS =====
            
            System.out.println("========== TEST CONVERSION ==========");
            double resultat = proxy.conversion(100);
            System.out.println("Conversion de 100 : " + resultat);
            
            System.out.println("\n========== TEST GET COMPTE ==========");
            Compte compte = proxy.getCompte();
            System.out.println("Code : " + compte.getCode());
            System.out.println("Solde : " + compte.getSolde());
            
            System.out.println("\n========== TEST GET COMPTES ==========");
            for (Compte c : proxy.getComptes()) {
                System.out.println("Compte " + c.getCode() + " | Solde : " + c.getSolde());
            }
            
        } catch (Exception e) {
            System.err.println("❌ Erreur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}