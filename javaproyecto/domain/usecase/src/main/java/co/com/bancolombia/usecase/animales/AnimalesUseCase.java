package co.com.bancolombia.usecase.animales;

import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@AllArgsConstructor
public class AnimalesUseCase {
    private AnimalesRepository animalesRepository;

    public void create(Animales animales) {animalesRepository.create(animales);}

    public Animales read(String Nombre){return animalesRepository.read(Nombre);}

    public void update(String Nombre, Animales animales) throws Exception {
        animalesRepository.update(Nombre,animales);
    }

    public void delete (String Nombre){animalesRepository.delete(Nombre);}
    public List<Animales> getAll() {
        return animalesRepository.getAll();}
}
