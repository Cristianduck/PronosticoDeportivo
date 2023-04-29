package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.HashMap;

public class ConexionDB {


    public  void cargaApostadores()

            throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/pronosticodeportivo", "xxx", "xxx");

        /*crear un objeto Statement para enviar sentencias sql*/

        Statement st = conn.createStatement();

        /*Para ejecutar un SELECT se usa executeQuery*/
        ResultSet rs = st.executeQuery("select * from resultados");
        /*
         * Para leer las filas de la BD un ciclo while
         */
        Resultado res = new Resultado();
        while (rs.next()) {
            //una vuelta por cada fila activa
            int idP = rs.getInt("IdPartido");
            int g1 = rs.getInt("GolesEquipo1");
            ;
            String e1 = rs.getString("Equipo1");
            int g2 = rs.getInt("GolesEquipo2");
            String e2 = rs.getString("Equipo2");
            int f = rs.getInt("Ronda");

            Partido nuevoPartido = new Partido(idP, g1, e1, g2, e2, f);
            res.agregarPartido(nuevoPartido);
        }
        rs.close();
        conn.close();
        res.mostrarPartidos();
        /*ListadoApostadores la = new ListadoApostadores();
        while (rs.next()) {
            //una vuelta por cada fila activa
            int idA = rs.getInt("IDApostador");
            String nom = rs.getString("Nombre");
            String ape = rs.getString("Apellido");
            int doc = rs.getInt("documento");
            //System.out.println(idA + " - " + nom + " - " + ape + " - " + doc);
            Apostador nuevoApostador = new Apostador(idA, nom, ape, doc);
            la.agregarApostador(nuevoApostador);
        }

        rs.close();
        conn.close();
        la.mostrarApostadores();*/

    }
}




