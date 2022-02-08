// l’interface ClientService

package ma.cigma.pfe.services;

import ma.cigma.pfe.models.Client;

public interface ClientService {

    Client save(Client c);
    Client modify(Client c);
    void removeById(long id);

    Client getById(long id);

}
