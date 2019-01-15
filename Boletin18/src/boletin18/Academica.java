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
public class Academica {
    private int numReferencia;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academica() {
        this.numReferencia = 2018;
    }

    public Academica(String nome, int nota, Persoal alumno) {
        this.numReferencia = 2018;
        this.nome = nome;
        this.nota = analizarNota(nota);
        this.alumno = alumno;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = analizarNota(nota);
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Datos alumno: " + "numReferencia=" + numReferencia + ", nome=" + nome + ", nota=" + nota + ", " + alumno.toString();
    }
    
    private int analizarNota(int nota){
        if(nota < 1 || nota > 10){
            System.out.println("Nota inválida");
            return 0;
        }
        else{
            return nota;
        }
    }
    
    private void numCorrelativo(){
        
    }
    
}
