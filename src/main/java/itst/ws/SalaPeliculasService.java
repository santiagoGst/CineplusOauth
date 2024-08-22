package itst.ws;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itst.model.SalaPeliculas;


@Service
@Transactional
public class SalaPeliculasService {
	
	@Autowired
	private SalaPeliculasRepository repo;
	
	public List<SalaPeliculas> obtenerTodos() {
		return repo.findAll();
	}

	public void guardar(SalaPeliculas salapelicula) {
		repo.save(salapelicula);
	}
	
	public void guardarPost(SalaPeliculas salapelicula) {
		if(!repo.existsById(salapelicula.getId())) {
			repo.save(salapelicula);
		}
	}

	public SalaPeliculas obtenerPorId(Integer numeroId) {
		return repo.findById(numeroId).get();
	}

	public void eliminar(Integer numeroId) {
		repo.deleteById(numeroId);
	}

}
