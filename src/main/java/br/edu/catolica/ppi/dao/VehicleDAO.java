package br.edu.catolica.ppi.dao;

import br.edu.catolica.ppi.domain.Vehicle;

import java.util.List;

public class VehicleDAO extends GenericDAOImpl<Vehicle>{

    @Override
    public void saveOrUpdate(Vehicle entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void saveList(List<Vehicle> entities) {
        super.saveList(entities);
    }
}
