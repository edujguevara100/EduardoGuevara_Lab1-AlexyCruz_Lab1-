/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
//Las Clases cuentan con un nombre, sección, cantidad máxima de alumnos, maestro, unidades
//valorativas y una lista de alumnos que reciben dicha clase (Esta lista solo contendrá los nombres de los

import java.util.ArrayList;

//alumnos). 
/**
 *
 * @author edujg
 */
public class Clases {

    public String nombre;
    public int seccion;
    public int cantmaxalum;
    public String maestro;
    public int unidades;
    public ArrayList<String> alumnos;

    public void Clases() {

    }

    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void Setseccion(int seccion) {
        this.seccion = seccion;
    }

    public void Setcantmaxalum(int cantmaxalum) {
        this.cantmaxalum = cantmaxalum;
    }

    public void Setmaestro(String maestro) {
        this.maestro = maestro;
    }

    public void Setunidades(int unidades) {
        this.unidades = unidades;
    }

    public void Setalumnos(ArrayList<String> alumnos) {
        this.alumnos = alumnos;
    }

    public String Getnombre() {
        return nombre;
    }

    public int Getseccion() {
        return seccion;
    }

    public int Getcantmaxalum() {
        return cantmaxalum;
    }

    public String Getmaestro() {
        return maestro;
    }

    public int Getunidades() {
        return unidades;
    }

    public ArrayList Getalumnos() {
        return alumnos;
    }
}
