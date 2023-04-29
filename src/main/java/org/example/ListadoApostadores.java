package org.example;

import java.util.HashMap;

public class ListadoApostadores {

    private HashMap<Integer,Apostador> apostadores;

    public ListadoApostadores(){
        apostadores = new HashMap<>();
    }

    public void agregarApostador(Apostador nuevo){
        apostadores.put(nuevo.getIdApostador(),nuevo);
    }

    public void mostrarApostadores(){
        for(Apostador ap: apostadores.values()){
            System.out.println(ap);
        }
    }

    public HashMap<Integer,Apostador> getApostadores(){
        return apostadores;
    }



}
