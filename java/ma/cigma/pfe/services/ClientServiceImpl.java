// La classe d’implémentation de l’interface Client Service

package ma.cigma.pfe.services;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;


public class ClientServiceImpl implements ClientService{
    private IClientDao dao;
    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return null;
    }


}
