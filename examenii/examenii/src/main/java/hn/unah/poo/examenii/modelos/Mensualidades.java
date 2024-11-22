package hn.unah.poo.examenii.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "mensualidades")
public class Mensualidades {

    @Column(name = "idmensualidad")
    private int idMensualidad;

    @Column(name = "numerocondominio")
    private int numeroCondominio;

    private double monto;

    private char estado;

    @Column(name = "fechapago")
    private Date fechaPago;

}
