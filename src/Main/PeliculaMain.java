/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.ServicioPelicula;

/**
 *
 * @author Usuario
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ServicioPelicula aux = new ServicioPelicula();
            aux.crearPelicula();

            aux.filtrarPelicula();
            
            
    
    }
    
}
