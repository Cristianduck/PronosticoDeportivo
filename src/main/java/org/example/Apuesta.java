package org.example;

public class Apuesta {

    private int idApuesta;
    private int codPartido;
    private String equipo1;
    private int resultado;

    private String equipo2;
    private int fecha;
    private int codApostador;

    public int getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(int idApuesta) {
        this.idApuesta = idApuesta;
    }

    public int getCodPartido() {
        return codPartido;
    }

    public void setCodPartido(int codPartido) {
        this.codPartido = codPartido;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getCodApostador() {
        return codApostador;
    }

    public void setCodApostador(int codApostador) {
        this.codApostador = codApostador;
    }

    public Apuesta(int idApuesta, int codPartido, String equipo1, int resultado, String equipo2, int fecha, int codApostador) {
        this.idApuesta = idApuesta;
        this.codPartido = codPartido;
        this.equipo1 = equipo1;
        this.resultado = resultado;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.codApostador = codApostador;
    }
}
