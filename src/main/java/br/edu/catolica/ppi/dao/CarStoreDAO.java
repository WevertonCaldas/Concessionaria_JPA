package br.edu.catolica.ppi.dao;

import br.edu.catolica.ppi.domain.CarStore;

import java.util.List;

public class CarStoreDAO extends GenericDAOImpl<CarStore>{

    @Override
    public void saveOrUpdate(CarStore entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void saveList(List<CarStore> entities) {
        super.saveList(entities);
    }


}
