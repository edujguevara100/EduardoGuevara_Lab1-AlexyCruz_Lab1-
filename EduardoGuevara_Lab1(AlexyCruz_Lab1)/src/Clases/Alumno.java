/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
//En la sección de Matricula, primero se deberán registrar los alumnos, que poseen un nombre, número
//de cuenta, carrera, edad, dinero disponible, usuario, contraseña, clases que está cursando (solo contara

import java.util.ArrayList;

//con las secciones de la clase) y un buzón
/**
 *
 * @author edujg
 */
public class Alumno {

    public String nombre;
    public int numc;
    public String carrera;
    public int edad;
    public double dinero;
    public String usuario;
    public String contra;
    public ArrayList<String> clases;
    public String buzon;

    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void Setnumc(int numc) {
        this.numc = numc;
    }

    public void Setcarrera(String carrera) {
        this.carrera = carrera;
    }

    public void Setedad(int edad) {
        this.edad = edad;
    }

    public void Setdinero(double dinero) {
        this.dinero = dinero;
    }

    public void Setusuario(String usuario) {
        this.usuario = usuario;
    }

    public void Setcontra(String contra) {
        this.contra = contra;
    }

    public void Setclases(ArrayList clases) {
        this.clases = clases;
    }

    public void Setbuzon(String buzon) {
        this.buzon += buzon;
    }

    public String Getnombre() {
        return nombre;
    }

    public int Getnumc() {
        return numc;
    }

    public String Getcarrera() {
        return carrera;
    }

    public int Getedad() {
        return edad;
    }

    public double Getdinero() {
        return dinero;
    }

    public String Getusuario() {
        return usuario;
    }

    public String Getcontra() {
        return contra;
    }

    public ArrayList Getclases() {
        return clases;
    }

    public String Getbuzon() {
        return buzon;
    }
}
