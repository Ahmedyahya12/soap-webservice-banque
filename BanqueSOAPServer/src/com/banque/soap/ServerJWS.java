package com.banque.soap;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:9001/BanqueService";
        Endpoint.publish(url, new BanqueService());
        System.out.println("✅ Serveur SOAP démarré sur : " + url);
    }
}