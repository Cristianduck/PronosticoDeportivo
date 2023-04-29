package org.example;

import java.util.ArrayList;

public class Resultado {

    private ArrayList<Partido> resultados;

    public Resultado(){
        resultados = new ArrayList<>();
    }

    public void agregarPartido(Partido nuevo){
        resultados.add(nuevo);
    }

    public void mostrarPartidos(){

        System.out.println(" RESULTADOS ");

        for(Partido pp:resultados) {
            int f = pp.getFecha();
            String e1 = pp.getEquipo_1();
            int g1 = pp.getGolesEquipo1();
            int g2 = pp.getGolesEquipo2();
            String e2 = pp.getEquipo_2();

            System.out.println("Ronda: " +f+"."+" "+e1+" "+g1+" - "+g2+" "+e2);
       }
   }

    public ArrayList<Partido> getResultados(){
        return resultados;
    }

}
