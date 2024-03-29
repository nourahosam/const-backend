package backend.construction.service;

import backend.construction.DAO.EmployeeTypes;
import backend.construction.repository.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTypeServiceImpl implements EmployeeTypeService {

    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    @Override
    public EmployeeTypes create(EmployeeTypes request){
        return employeeTypeRepository.save(request);
    }

    @Override
    public List<EmployeeTypes> getAll(){
        return employeeTypeRepository.findAll();
    }

    @Override
    public EmployeeTypes getById(Long id){
        return employeeTypeRepository.getReferenceById(id);
    }
}
