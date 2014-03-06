package com.cenfotec.universidad.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.cenfotec.universidad.ejb.EstudianteXCurso;

public interface EstudianteXCursoRepository extends CrudRepository<EstudianteXCurso, Integer>{
	
	EstudianteXCurso findByEstudianteXCursoId(int id);
	
	List<EstudianteXCurso> findAll();
	
}
