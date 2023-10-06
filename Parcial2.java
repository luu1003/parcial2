import java.util.Scanner;
import java.util.Random;
public class Parcial2 {

    public static void main(String[] args) {

        int cantidadHoteles = (int)((Math.random()*7)+1);
            System.out.println("la cantidad de hoteles es:" + cantidadHoteles);

        for(int i=0; i < cantidadHoteles; i++){ //hacer un ciclo que termine cuando sea igual al número de hoteles

            int cantidadPisos = (int)((Math.random()*15)+3);
            int cantidadHoras = (int)((Math.random()*24)+0);
            int tipoDeLuz = (int)((Math.random()*3)+1); //Generar valores aleatorios para las diferentes variables

            System.out.println("la cantidad de horas encencidas en el hotel" + (i+1) + "es:" + cantidadHoras);
                    //mostrar la cantidad de horas encendidas
                if(tipoDeLuz==1) {      //hacer un ciclo para los diferentes tipos de luz
                    System.out.println("el gasto del hotel" + (i + 1) + "en luces es:" + (cantidadHoras * cantidadPisos * 0.25));
                }       
                if(tipoDeLuz==2) {
                    System.out.println(
                        "el gasto del hotel" + (i + 1) + "en luces es:" + (cantidadHoras * cantidadPisos * 0.50));
                }
                if(tipoDeLuz==3){
                        System.out.println("el gasto del hotel" + (i + 1) + "en luces es:" + (cantidadHoras * cantidadPisos * 1));

                }
        }

    }











  }