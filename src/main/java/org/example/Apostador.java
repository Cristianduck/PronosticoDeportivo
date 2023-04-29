package org.example;

public class Apostador {

    private int idApostador;
    private String nombre;
    private String apellido;
    private int dni;

    public int getIdApostador() {return idApostador;}
    public void setIdApostador(int idApostador) {this.idApostador = idApostador;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public int getDni() {return dni;}
    public void setDni(int dni) {this.dni = dni;}

    public Apostador(){}
    public Apostador(int idApostador, String nombre, String apellido, int dni) {
        this.idApostador = idApostador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {

        String apellidoNombre = nombre+" "+apellido;
        return apellidoNombre;
    }


}
