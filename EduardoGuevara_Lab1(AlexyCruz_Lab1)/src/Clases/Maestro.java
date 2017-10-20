/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
//Los maestros cuentan con un nombre, titulo, maestra, salario, Usuario, Contraseña, Cantidad máxima de
//clases y una lista de clases que imparte (esta lista solo contara con la sección de la clase). 

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class Maestro {

    public String nombre;
    public String titulo;
    public String maestria;
    public double salario;
    public String usuario;
    public String contra;
    public int cantmaxclases;
    public ArrayList<String> listaclases;

    public Maestro() {

    }

    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void Setcantmaxclases(int cantmaxclases) {
        this.cantmaxclases = cantmaxclases;
    }

    public void Setcontra(String contra) {
        this.contra = contra;
    }

    public void Setmaestria(String maestria) {
        this.maestria = maestria;
    }

    public void Settitulo(String titulo) {
        this.titulo = titulo;
    }

    public void Setsalario(double salario) {
        this.salario = salario;
    }

    public void Setusuario(String usuario) {
        this.usuario = usuario;
    }

    public void Setlistaclases(ArrayList<String> listaclases) {
        this.listaclases = listaclases;
    }

    public String Getnombre() {
        return nombre;
    }

    public int Getcantmaxclases() {
        return cantmaxclases;
    }

    public String Getcontra() {
        return contra;
    }

    public String Getmaestria() {
        return maestria;
    }

    public String Gettitulo() {
        return titulo;
    }

    public double Getsalario() {
        return salario;
    }

    public String Getusuario() {
        return usuario;
    }

    public ArrayList Getlistaclases() {
        return listaclases;
    }
}
