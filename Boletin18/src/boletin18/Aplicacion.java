/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;
import boletin18_2.Persoal;

/**
 *
 * @author aparcerozas
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoal pedro = new Persoal("986345512","pedrosanchez@partidosocialista.org");
        Academica pedrin = new Academica(1224, "Pedro", 13, pedro);
        pedrin.setNota(8);
        System.out.println(pedrin.toString());
    }
    
}
