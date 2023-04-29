package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException, SQLException {


        Path archivoResultado = Paths.get("resultados.txt");
        Scanner lectorResultado = new Scanner(archivoResultado);
        lectorResultado.useDelimiter("[;\\n\\r]+");


        Path archivoApostador = Paths.get("apostador.txt");
        Scanner lectorApostador = new Scanner(archivoApostador);
        lectorApostador.useDelimiter("[;\\n\\r]+");

        Path archivoPronostico = Paths.get("pronostico.txt");
        Scanner lectorPronostico = new Scanner(archivoPronostico);
        lectorPronostico.useDelimiter("[;\\n\\r]+");

        Resultado res = new Resultado();
        while (lectorResultado.hasNextInt()) {
            int idP = lectorResultado.nextInt();
            int g1 = lectorResultado.nextInt();
            String e1 = lectorResultado.next();
            int g2 = lectorResultado.nextInt();
            String e2 = lectorResultado.next();
            int f = lectorResultado.nextInt();

            Partido nuevoPartido = new Partido(idP, g1, e1, g2, e2, f);
            res.agregarPartido(nuevoPartido);
        }

        lectorResultado.close();
        //res.mostrarPartidos();

       ConexionDB conexionApostador =new ConexionDB();
        conexionApostador.cargaApostadores();

        ListadoApostadores la = new ListadoApostadores();
        while (lectorApostador.hasNextInt()) {
            int idA = lectorApostador.nextInt();
            String nom = lectorApostador.next();
            String ape = lectorApostador.next();
            int doc = lectorApostador.nextInt();

            Apostador nuevoApostador = new Apostador(idA, nom, ape, doc);
            la.agregarApostador(nuevoApostador);
        }
        lectorApostador.close();
        //la.mostrarApostadores();
        //la.mostrarApostadores();

        Pronostico pro = new Pronostico();
        while (lectorPronostico.hasNextInt()) {

            int idP = lectorPronostico.nextInt();
            int codP = lectorPronostico.nextInt();
            String e1 = lectorPronostico.next();
            int re = lectorPronostico.nextInt();
            String e2 = lectorPronostico.next();
            int fe = lectorPronostico.nextInt();
            int codA = lectorPronostico.nextInt();

            Apuesta nuevaApuesta = new Apuesta(idP, codP, e1, re, e2, fe, codA);
            pro.agregarPronostico(nuevaApuesta);
        }

        lectorPronostico.close();
        //pro.mostrarPronosticos();
        pro.mostrarPronosticos(la.getApostadores());
        pro.mostrarPuntaje(res.getResultados(), la.getApostadores());

    }
}


