package info.moraes.fabricanteservice.repository;


import info.moraes.fabricanteservice.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
}
