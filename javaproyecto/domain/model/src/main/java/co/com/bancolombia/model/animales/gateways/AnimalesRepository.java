package co.com.bancolombia.model.animales.gateways;

import co.com.bancolombia.model.animales.Animales;

import java.util.List;

public interface AnimalesRepository {
    void create (Animales animales);
    Animales read (String animalnom);
    default void update (String animalnom, Animales animales) throws Exception{}
    void delete (String animalnom);
    List<Animales> getAll();
}
