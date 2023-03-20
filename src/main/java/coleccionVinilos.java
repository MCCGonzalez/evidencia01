import java.lang.*;
import java.util.*;

public class coleccionVinilos {

    public static void main (String[] args){

        /*
        Crear una coleccion de vinilos maximo 100
        Se deben poder agregar vinilos (nombre artista, nombre disco, año lanzamiento)
        Se debe poder buscar un vinilo y saber si está o no en la colección
        ¿Cuantos vinilos tiene la coleccion?
        cuantos espacios quedan?

         */
        coleccion();
    }

    public static void coleccion(){

        System.out.println("bienvenido");

        //listaVinilos();
        vinilosPredefinidos(listaVinilos());
        menu();
        //totalVinilos(vinilosPredefinidos());
        //mostrarColección(vinilosPredefinidos());

    }

    public static String[][] listaVinilos(){
        String[][] vinilos = new String[100][3];
        return vinilos;
    }
    public static String[][] vinilosPredefinidos(String[][] vinilos){


        int posicion = 0;

        agregarVinilo(posicion, vinilos, "Iron maiden", "Iron maiden", "1980");
        agregarVinilo(posicion + 1, vinilos, "Iron maiden", "killers", "1981");
        agregarVinilo(posicion + 2, vinilos, "Iron maiden", "The number of the beast", "1982");
        agregarVinilo(posicion + 3, vinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(posicion + 4, vinilos, "AC-DC", "Highway to hell", "1979");
        agregarVinilo(posicion + 5, vinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(posicion + 6, vinilos, "Judas priest", "British steel", "1980");
        agregarVinilo(posicion + 7, vinilos, "Judas priest", "Painkiller", "1990");
        agregarVinilo(posicion + 8, vinilos, "Judas priest", "Defenders of the faith", "1984");
        agregarVinilo(posicion + 9, vinilos, "Judas priest", "Destroyer", "1976");

        return vinilos;
    }
    public static void menu(){

        System.out.println("bienvenido, ingrese un numero"
                + "\n1) Agregar vinilo"
                + "\n2) Buscar vinilo"
                + "\n3) cuantos vinilos hay"
                + "\n4) cuantos espacios quedan");

        entradaMenu();

    }

    public static void entradaMenu(){

        boolean contener = false;
        Scanner sc = new Scanner(System.in);
        int entrada = 0;

        do {
            System.out.println("ingrese un numero");
            if (sc.hasNextInt()) {
                entrada = sc.nextInt();
                contener = true;

            } else {
                sc.nextLine();
                System.out.println("ingrese un valor entero valido");

            }

        } while (!contener);

        switch (entrada){

            case 1:
                System.out.println("caso 1");
                break;

            case 2:
                System.out.println("caso 2");
                break;

            case 3:
                mostrarColección(vinilosPredefinidos(listaVinilos()));
                break;

            default:
                System.out.println("ingrese un numero entre 1 y 3");
                entradaMenu();


        }
    }
    public static void agregarVinilo(int posicion, String[][] vinilos, String titulo, String artista, String año){

        //Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese: disco - artista - año");
        for(int i = 0; i < 3; i++){
            if(i == 0){

                vinilos[posicion][i] = titulo;

            }else if(i == 1){

                vinilos[posicion][i] = artista;

            }else{

                vinilos[posicion][i] = año;

            }
        }
    }

    public static void totalVinilos(String[][] vinilos){

        System.out.println("Espacio maximo coleccion: " + vinilos.length);
        System.out.println("Hay un total de: "+ " espacios disponibles en la colección");

    }
    public static void buscarArtista(String[][] vinilos){

    }
    public static void mostrarColección(String[][]vinilos){

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(vinilos[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void mostrarTotal(){

    }
    public static void mostrarDisponibles(){

    }
    public static void disponibles(){

        //int
    }
    public static void mostrarBusquedaArtista(){

    }

}
