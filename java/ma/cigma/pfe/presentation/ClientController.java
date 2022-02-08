package ma.cigma.pfe.presentation;
import ma.cigma.pfe.services.ClientService;
import ma.cigma.pfe.models.Client;

public class ClientController {

    ClientService clientService;
    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService   param....");
        this.clientService = clientService;
    }



    public Client save(Client c ){
        return clientService.save(c);
    }


    public void modify(Client c){
        clientService.modify(c);
    }
    public void removeById(long id){
        clientService.removeById(id);
    }
    public Client getById(long id){
        return clientService.getById(id);
    }

}
