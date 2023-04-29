package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Pronostico {

    private ArrayList<Apuesta> pronosticos;

    public Pronostico(){
        pronosticos = new ArrayList<>();
    }

    public void agregarPronostico(Apuesta nueva)
    {
        pronosticos.add(nueva);
    }

    public void listaDeApostadores(ArrayList<Apostador> apostadors){

        for(Apostador ap: apostadors){
            String n1 = ap.getNombre();
            System.out.println(n1);
        }

    }

       public void mostrarPronosticos(HashMap<Integer,Apostador> apost){
      //public void mostrarPronosticos(){

        System.out.println(" PRONOSTICOS ");

        for(Apuesta aa:pronosticos){
               //int a1 = aa.getIdApuesta();
               //int a2 = aa.getCodPartido();
               String eq1 = aa.getEquipo1();
               int re = aa.getResultado();
               String eq2 = aa.getEquipo2();
               int ronda = aa.getFecha();
               int codA = aa.getCodApostador();

               char E=' ';
               char L=' ';
               char V=' ';
               switch (re) {
                  case 0:
                    E='x';
                    break;
                  case 1:
                    L='X';
                    break;
                  case 2:
                    V='X';
                    break;
                  default:
                    break;
              }

                System.out.println("Ronda: "+ronda+" "+apost.get(codA)+" - "+eq1+"("+L+")"+"("+E+")"+"("+V+")"+eq2);

        }
      }

    int resultadoPartido(int goles1,int goles2){

        int res;
        if(goles1 == goles2){
            // EMPATE
            res=0;
        }
        else{
            if(goles1 > goles2){
                // GANO LOCAL
                res=1;
            }
            else{
                // GANO VISITANTE
                res=2;
            }
        }
        return res;
    }


    HashMap<Integer,Integer> puntajeApostadoresRonda = new HashMap<Integer,Integer>();

    public void mostrarPuntaje(ArrayList<Partido> result,HashMap<Integer,Apostador> apost){

          int cantidadRondas=3;
          int contarAciertos=0;
          int totalAciertosRonda=0;

        for(int x=1;x<=cantidadRondas;x++){
              System.out.println(" ");
              System.out.println("Ronda "+x);

                   int cantJugadores = apost.size();

                   for(int y=1;y<=cantJugadores;y++){

                       for(Partido pp:result){

                              int ff1 = pp.getFecha();
                              int dd = pp.getIdPartido();
                              int g1 = pp.getGolesEquipo1();
                              int g2 = pp.getGolesEquipo2();

                                 int resPartido = resultadoPartido(g1,g2);

                                 for(Apuesta aa:pronosticos){

                                      int ff2 = aa.getFecha();
                                      int idA = aa.getCodApostador();
                                      int ddd = aa.getCodPartido();

                                     if( (ff1==x)  && (ff2==x) && (idA==y) && (dd==ddd)){

                                              if(aa.getResultado()==resPartido){

                                                  // ACIERTOS
                                                  contarAciertos++;
                                                  totalAciertosRonda++;

                                              }
                                              else{
                                                    //
                                                  totalAciertosRonda--;
                                              }
                                      }
                                     //

                                 }
                                 //


                       }

                          //
                          if(contarAciertos==totalAciertosRonda){
                              contarAciertos=contarAciertos+1;
                          }
                          System.out.println("    Puntos: "+contarAciertos);
                          contarAciertos=0;
                          totalAciertosRonda=0;



                   }

          }
            ////



      }


}
