package itst.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import itst.model.Peliculas;

public interface PeliculasRepository extends JpaRepository<Peliculas, Integer> {
	
}
