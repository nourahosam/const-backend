package backend.construction.service;

import backend.construction.DAO.Vehicles;
import backend.construction.repository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclesServiceImpl implements VehiclesService {

    @Autowired
    VehiclesRepository vehiclesRepository;

    @Override
    public Vehicles create(Vehicles request){
        return vehiclesRepository.save(request);
    }

    @Override
    public List<Vehicles> getAll(){
        return vehiclesRepository.findAll();
    }

    @Override
    public Vehicles getById(Long id){
        return vehiclesRepository.findById(id).orElseThrow();
    }
}
