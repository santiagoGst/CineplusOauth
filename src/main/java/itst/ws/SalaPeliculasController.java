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

import itst.model.SalaPeliculas;


@RestController
public class SalaPeliculasController {
	
	@Autowired
	private SalaPeliculasService service;
	
	@GetMapping("/salapeliculas")
	public List<SalaPeliculas> obtenerTodas() {
		return service.obtenerTodos();
	}
	
	@GetMapping("/salapeliculas/{numeroId}")
	public ResponseEntity<SalaPeliculas> obtenerPorId(@PathVariable Integer numeroId) {
		//try {
			SalaPeliculas salapeliculas = service.obtenerPorId(numeroId);
			return new ResponseEntity<SalaPeliculas>(salapeliculas, HttpStatus.OK);
		//} catch (NoSuchElementException e) {
		//	return new ResponseEntity<Peliculas>(HttpStatus.NOT_FOUND);
		//}
	}
	
	@PostMapping("/salapeliculas")
	public void registrar(@RequestBody SalaPeliculas salapeliculas) {
		//Aqui
		service.guardarPost(salapeliculas);
	}
	
	@PutMapping("/salapeliculas/{numeroId}")
	public ResponseEntity<?> actualizar(@RequestBody SalaPeliculas salapeliculas, @PathVariable Integer numeroId) {
		//try {
			SalaPeliculas auxSaPe = service.obtenerPorId(numeroId);
			salapeliculas.setId(auxSaPe.getId());
			service.guardar(salapeliculas);
			return new ResponseEntity<String>("Registro Actualizada", HttpStatus.OK);
		//}catch (NoSuchElementException e) {
	    //    return new ResponseEntity<String>("El registro con el numero de balon proporcionado no se encuentra en la base de datos", HttpStatus.NOT_FOUND);
	    //}
	}
	
	@DeleteMapping("/salapeliculas/{numeroId}")
	public void eliminar(@PathVariable Integer numeroId) {
		//try {
			service.eliminar(numeroId);
		//}catch(Exception e) {
		//	
		//}
	}
	
	

}
