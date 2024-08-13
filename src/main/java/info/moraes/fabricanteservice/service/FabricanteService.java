package info.moraes.fabricanteservice.service;
import info.moraes.fabricanteservice.model.Fabricante;
import info.moraes.fabricanteservice.repository.FabricanteRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FabricanteService {
    private final FabricanteRepository fabricanteRepository;
    public Optional<Fabricante> getById(long id) {
        return fabricanteRepository.findById(id);
    }
    public List<Fabricante> getAll() {return fabricanteRepository.findAll();}
}
