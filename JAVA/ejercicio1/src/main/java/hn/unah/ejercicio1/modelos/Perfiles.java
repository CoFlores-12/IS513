package hn.unah.ejercicio1.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="perfil")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Perfiles {
    @Id
    @Column(name="idperfil")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idperfil;

    private String rol;

    private String descripcion;
}
