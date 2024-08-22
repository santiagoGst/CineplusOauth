package itst.ws;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itst.model.Salas;

@Service
@Transactional
public class SalasService {
	
	@Autowired
	private SalasRepository repo;
	
	public List<Salas> obtenerTodos() {
		return repo.findAll();
	}

	public void guardar(Salas salas) {
		repo.save(salas);
	}
	
	public void guardarPost(Salas salas) {
		if(!repo.existsById(salas.getId())) {
			repo.save(salas);
		}
	}


	public Salas obtenerPorId(Integer numeroId) {
		return repo.findById(numeroId).get();
	}

	public void eliminar(Integer numeroId) {
		repo.deleteById(numeroId);
	}

}
