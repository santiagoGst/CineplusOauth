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
import itst.model.Clasificaciones;

@RestController
public class ClasificacionesController {
	
	@Autowired
	private ClasificacionesService service;
	
	@GetMapping("/clasificaciones")
	public List<Clasificaciones> obtenerTodas() {
		return service.obtenerTodos();
	}
	
	@GetMapping("/clasificaciones/{numeroId}")
	public ResponseEntity<Clasificaciones> obtenerPorId(@PathVariable Integer numeroId) {
		//try {
			Clasificaciones clasificacion = service.obtenerPorId(numeroId);
			return new ResponseEntity<Clasificaciones>(clasificacion, HttpStatus.OK);
		//} catch (NoSuchElementException e) {
		//	return new ResponseEntity<Peliculas>(HttpStatus.NOT_FOUND);
		//}
	}
	
	@PostMapping("/clasificaciones")
	public void registrar(@RequestBody Clasificaciones clasificaciones) {
		//Aqui
		service.guardarPost(clasificaciones);
	}
	
	@PutMapping("/clasificaciones/{numeroId}")
	public ResponseEntity<?> actualizar(@RequestBody Clasificaciones clasificaciones, @PathVariable Integer numeroId) {
		//try {
			Clasificaciones auxClasi = service.obtenerPorId(numeroId);
			clasificaciones.setId(auxClasi.getId());
			service.guardar(clasificaciones);
			return new ResponseEntity<String>("Clasificacion Actualizada", HttpStatus.OK);
		//}catch (NoSuchElementException e) {
	    //    return new ResponseEntity<String>("El registro con el numero de balon proporcionado no se encuentra en la base de datos", HttpStatus.NOT_FOUND);
	    //}
	}
	
	@DeleteMapping("/clasificaciones/{numeroId}")
	public void eliminar(@PathVariable Integer numeroId) {
		//try {
			service.eliminar(numeroId);
		//}catch(Exception e) {
		//	
		//}
	}
	
	

}
