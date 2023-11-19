package hn.unah.ejercicio1.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {

    @Id
    @Column(name="codigousuario")
    private String codigoUsuario; 

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @ManyToOne()
    @JoinColumn(name="idperfil", referencedColumnName = "idperfil")
    private Perfiles perfil;
}
