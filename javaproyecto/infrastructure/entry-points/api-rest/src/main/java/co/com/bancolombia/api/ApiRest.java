package co.com.bancolombia.api;
import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.usecase.animales.AnimalesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor

public class ApiRest {
    private AnimalesUseCase animalesUseCase;

    @GetMapping(path = "/animales/{animalnom}")
    public Animales read(@PathVariable String animalnom) {
        return animalesUseCase.read(animalnom);
    }

    @PostMapping(path = "/animales")
    public void create(@RequestBody Animales animales) {
        animalesUseCase.create(animales);
    }

    @PutMapping(path = "/animales/{animalnom}")
    public void update(@PathVariable String animalnom,@RequestBody Animales animales){
        try {
            animalesUseCase.update(animalnom,animales);
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }

    }
    @DeleteMapping(path="/animales/{animalnom}")
    public void delete (@PathVariable String animalnom){ animalesUseCase.delete(animalnom);}

    @GetMapping(path="/animales")
    public List<Animales> getAll() {return animalesUseCase.getAll();}
}
