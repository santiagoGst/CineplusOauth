package itst.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import itst.model.TipoBoletos;

@RestController
public class TipoBoletosController {
	@Autowired
	private TipoBoletosService service;
	
	@GetMapping("/tipoboletos")
	public List<TipoBoletos> obtenerTodos() {
		return service.obtenerTodos();
	}
	
	@GetMapping("/tipoboletos/{numeroId}")
	public ResponseEntity<TipoBoletos> obtenerPorId(@PathVariable Integer numeroId) {
		//try {
		TipoBoletos tipoboleto = service.obtenerPorId(numeroId);
			return new ResponseEntity<TipoBoletos>(tipoboleto, HttpStatus.OK);
		//} catch (NoSuchElementException e) {
		//	return new ResponseEntity<Salas>(HttpStatus.NOT_FOUND);
		//}
	}
	
	@PostMapping("/tipoboletos")
	public void registrar(@RequestBody TipoBoletos tipoboletos) {
		service.guardarPost(tipoboletos);
	}
	
	@PutMapping("/tipoboletos/{numeroId}")
	public ResponseEntity<?> actualizar(@RequestBody TipoBoletos tipoboletos, @PathVariable Integer numeroId) {
		//try {
			TipoBoletos auxTipo = service.obtenerPorId(numeroId);
			tipoboletos.setId(auxTipo.getId());
			service.guardar(tipoboletos);
			return new ResponseEntity<String>("Tipo de Boleto Actualizada", HttpStatus.OK);
		//}catch (NoSuchElementException e) {
	    //    return new ResponseEntity<String>("El registro con el numero de balon proporcionado no se encuentra en la base de datos", HttpStatus.NOT_FOUND);
	    //}
	}
	
	@DeleteMapping("/tipoboletos/{numeroId}")
	public void eliminar(@PathVariable Integer numeroId) {
		//try {
			service.eliminar(numeroId);
		//}catch(Exception e) {
		//	
		//}
	}

}
