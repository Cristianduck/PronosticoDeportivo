package org.example;

public class Partido {

    private int idPartido;
    private int golesEquipo1;
    private String equipo_1;
    private int golesEquipo2;
    private String equipo_2;
    private int fecha;

    public int getIdPartido() {return idPartido;}
    public void setIdPartido(int idPartido) {this.idPartido = idPartido;}

    public int getGolesEquipo1() { return golesEquipo1;}
    public void setGolesEquipo1(int golesEquipo1) {this.golesEquipo1 = golesEquipo1;}

    public String getEquipo_1() {return equipo_1;}
    public void setEquipo_1(String equipo_1) {this.equipo_1 = equipo_1;}
    public int getGolesEquipo2() {return golesEquipo2;}
    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
    public String getEquipo_2() {return equipo_2;}
    public void setEquipo_2(String equipo_2) {this.equipo_2 = equipo_2;}
    public int getFecha() { return fecha; }
    public void setFecha(int fecha) { this.fecha = fecha;}

    public  Partido(){}
    public Partido(int idPartido,int golesEquipo1,String equipo_1,int golesEquipo2, String equipo_2,int fecha) {

        this.idPartido=idPartido;
        this.golesEquipo1= golesEquipo1;
        this.equipo_1=equipo_1;
        this.golesEquipo2= golesEquipo2;
        this.equipo_2=equipo_2;
        this.fecha = fecha;
    }


}
