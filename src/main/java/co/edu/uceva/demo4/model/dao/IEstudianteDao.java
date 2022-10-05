package co.edu.uceva.demo4.model.dao;

import co.edu.uceva.demo4.model.entities.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface IEstudianteDao extends CrudRepository<Estudiante, Long> {
}
