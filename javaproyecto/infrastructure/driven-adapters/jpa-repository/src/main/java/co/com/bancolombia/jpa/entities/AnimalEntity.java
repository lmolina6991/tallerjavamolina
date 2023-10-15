package co.com.bancolombia.jpa.entities;

import jdk.jfr.Enabled;
import lombok.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="animales")
public class AnimalEntity {
    @Id
    private String animalnom;
    @Column
    private String especie;
    @Column
    private Integer numeroPatas;
    @Column
    private Character generoAnm;
    @Column
    private String habitad;
    @Column
    private Boolean domestico;
}

