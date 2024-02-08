package backend.construction.service;

import backend.construction.DAO.Vehicles;

import java.util.List;

public interface VehiclesService {
    public Vehicles create(Vehicles request);
    public List<Vehicles> getAll();
    public Vehicles getById(Long id);
}
