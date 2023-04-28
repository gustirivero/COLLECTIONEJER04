/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPelicula {
        ArrayList<Pelicula> pelicula;
        Pelicula peli = new Pelicula();

    public ServicioPelicula() {
        pelicula = new ArrayList();
    }

    public void crearPelicula() {
        char letra = 's';
        do {
            
        Scanner valor = new Scanner(System.in);
        System.out.println("Titulo de la pelicula: ");
        String title = valor.nextLine();
        System.out.println("Director de la pelicula: ");
        String direc = valor.nextLine();
        System.out.println("Duracion de la pelicula");
        Integer duracion = valor.nextInt();
        Pelicula pel = new Pelicula(title, direc, duracion);
        pelicula.add(pel);
        System.out.println("Desea ingresar otra pelicula s/n");
        letra = valor.next().charAt(0);        
     
        } while (letra == 's');

        
        System.out.println("Peliculas" + pelicula.toString());
     
            }

public void filtrarPelicula(){
    System.out.println("Filtrar pelicula mayor a 60min");
    pelicula.stream().filter(peli-> peli.getDuracion() > 60).forEach(  
    System.out::println);
    

}


}