package co.edu.uceva.demo4.model.service;

import co.edu.uceva.demo4.model.dao.IEstudianteDao;
import co.edu.uceva.demo4.model.entities.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listar() {
        return (List<Estudiante>) estudianteDao.findAll();
    }

    @Override
    public Estudiante findById(Long id) {
        return estudianteDao.findById(id).orElse(null);
    }

    @Override
    public void crear(Estudiante estudiante) {
        this.estudianteDao.save(estudiante);
    }

    @Override
    @Transactional
    public void delete(Estudiante estudiante) {
        this.estudianteDao.delete(estudiante);
    }


}
