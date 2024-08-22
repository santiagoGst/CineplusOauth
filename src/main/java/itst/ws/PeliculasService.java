package itst.ws;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itst.model.Peliculas;

@Service
@Transactional
public class PeliculasService {
	
	@Autowired
	private PeliculasRepository repo;
	
	public List<Peliculas> obtenerTodos() {
		return repo.findAll();
	}

	public void guardar(Peliculas peliculas) {
		//if(!repo.existsById(peliculas.getId())) {
			repo.save(peliculas);
		//}
	}
	
	public void guardarPost(Peliculas peliculas) {
		if(!repo.existsById(peliculas.getId())) {
		repo.save(peliculas);
	    }
	}

	public Peliculas obtenerPorId(Integer numeroId) {
		return repo.findById(numeroId).get();
	}

	public void eliminar(Integer numeroId) {
		repo.deleteById(numeroId);
	}
	
}
