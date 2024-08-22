package itst.ws;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itst.model.Clasificaciones;
import itst.model.Peliculas;

@Service
@Transactional
public class ClasificacionesService {
	
	@Autowired
	private ClasificacionesRepository repo;
	
	public List<Clasificaciones> obtenerTodos() {
		return repo.findAll();
	}

	public void guardar(Clasificaciones clasificaciones) {
			repo.save(clasificaciones);
	}
	
	public void guardarPost(Clasificaciones clasificaciones) {
		if(!repo.existsById(clasificaciones.getId())) {
		repo.save(clasificaciones);
	    }
	}

	public Clasificaciones obtenerPorId(Integer numeroId) {
		return repo.findById(numeroId).get();
	}

	public void eliminar(Integer numeroId) {
		repo.deleteById(numeroId);
	}
	

}
