package service;
import java.util.ArrayList;
import java.util.List;
import metier.Compte;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
@WebService
public class BanqueService {
    @WebMethod
public double conversion(@WebParam(name="s") int s){
    return s*5;
}

public List<Compte> getComptes() {
            List<Compte> comptes = new ArrayList<>();

            comptes.add(new Compte(769,4000 ,"01-09-2023"));
            comptes.add(new Compte(123, 3000 ,"01-10-2023"));
            comptes.add(new Compte(468,2500,"03-01-2023" ));

            return comptes;
        }
    }




