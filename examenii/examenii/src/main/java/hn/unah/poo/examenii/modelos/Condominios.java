package hn.unah.poo.examenii.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "condominios")
public class Condominios {

    @JoinColumn(name = "numerocondominio")
    private int numeroCondominio;

    private int nivel;

    private double area;

    private String color;

    private int parqueos;

    private String dni;

    @JsonIgnore
    Duenios duenios;
}
