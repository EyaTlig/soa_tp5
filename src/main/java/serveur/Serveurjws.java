package serveur;

import service.BanqueService;

import jakarta.xml.ws.Endpoint;

public class Serveurjws {

    public static void main(String[] args) {
        String url = "http://localhost:8084/";

        BanqueService monServiceWeb = new BanqueService();
        Endpoint.publish(url, monServiceWeb);

        System.out.println("Service web publié à l'adresse : " + url);
    }
}

