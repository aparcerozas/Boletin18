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
        Persoal pedrin = new Persoal("986345412", "pedrosanchez@partidosocialista.org");
        Persoal martina = new Persoal("986317731", "martasanchez@hotmail.com");
        Academica pedro = new Academica("Pedro", 13, pedrin);
        Academica marta = new Academica("Marta", 9, martina);
        pedro.setNota(8);
        System.out.println(pedro.toString());
        System.out.println(marta.toString());
    }
    
}
