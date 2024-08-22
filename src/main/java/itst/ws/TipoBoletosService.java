package itst.ws;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itst.model.TipoBoletos;

@Service
@Transactional
public class TipoBoletosService {
	
	@Autowired
	private TipoBoletosRepository repo;
	
	public List<TipoBoletos> obtenerTodos() {
		return repo.findAll();
	}

	public void guardar(TipoBoletos tipoboletos) {
			repo.save(tipoboletos);
	}
	
	public void guardarPost(TipoBoletos tipoboletos) {
		if(!repo.existsById(tipoboletos.getId())) {
			repo.save(tipoboletos);
		}
	}
	

	public TipoBoletos obtenerPorId(Integer numeroId) {
		return repo.findById(numeroId).get();
	}

	public void eliminar(Integer numeroId) {
		repo.deleteById(numeroId);
	}

}
