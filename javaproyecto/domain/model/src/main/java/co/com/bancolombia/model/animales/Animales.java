package co.com.bancolombia.model.animales;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animales {
    private String animalnom;
    private String especie;
    private Integer numeroPatas;
    private Character generoAnm;
    private String habitad;
    private Boolean domestico;

    public String getAnimalnom() {
        return animalnom;
    }

    public void setAnimalnom(String animalnom) {
        this.animalnom = animalnom;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public Character getGeneroAnm() {
        return generoAnm;
    }

    public void setGeneroAnm(Character generoAnm) {
        this.generoAnm = generoAnm;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public Boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(Boolean domestico) {
        this.domestico = domestico;
    }
}
