/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_lab1.alexycruz_lab1;

import javax.swing.JOptionPane;
import Clases.Alumno;
import java.util.ArrayList;
import Clases.Clases;
import Clases.Maestro;

/**
 *
 * @author edujg
 */
public class EduardoGuevara_Lab1AlexyCruz_Lab1 {
    
    static Maestro m = new Maestro();
    static Alumno a = new Alumno();
    static Clases c = new Clases();
    static ArrayList<String> ListaGeneralClases = new ArrayList();
    static int contv;
    static ArrayList<String> ListaGeneralAlumnos = new ArrayList();
    static int contc = 0;
    static ArrayList<String> ListaGeneralMaestros = new ArrayList();
    static ArrayList<String> Clasesinf = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char r = ' ', s = 's', h = 's';
        while (s == 's') {
            while (r == 's' || r == 'S' || ListaGeneralClases.size() == 0) {
                crearclases(ListaGeneralClases);
                if (ListaGeneralMaestros.size() != 0) {
                    for (int i = 0; i < c.cantmaxalum; i++) {
                        c.Setmaestro("Ingrese el maestro");
                        c.alumnos.add(JOptionPane.showInputDialog("Ingrese los alumnos de uno en uno"));
                    }
                }
                Clasesinf.add(c.Getmaestro() + "<" + c.Getalumnos() + "<" + c.Getseccion() + "<"
                        + c.Getcantmaxalum() + "<" + c.Getunidades() + "<" + c.Getnombre() + "<");
                String j = JOptionPane.showInputDialog("Desea seguir creando clases[s/n]");
                r = j.charAt(0);
            }
            switch (Menu()) {
                case 1:
                    if (ListaGeneralClases.size() != 0) {
                        String a = JOptionPane.showInputDialog("Desea crear clases[s/n]");
                        r = a.charAt(0);
                    }
                    while (r == 's' || r == 'S' || ListaGeneralClases.size() == 0) {
                        crearclases(ListaGeneralClases);
                        if (ListaGeneralMaestros.size() != 0) {
                            for (int i = 0; i < c.cantmaxalum; i++) {
                                c.Setmaestro("Ingrese el maestro");
                                c.alumnos.add(JOptionPane.showInputDialog("Ingrese los alumnos de uno en uno"));
                            }
                        }
                        Clasesinf.add(c.Getmaestro() + "<" + c.Getalumnos() + "<" + c.Getseccion() + "<"
                                + c.Getcantmaxalum() + "<" + c.Getunidades() + "<" + c.Getnombre() + "<");
                        String j = JOptionPane.showInputDialog("Desea seguir creando clases[s/n]");
                        r = j.charAt(0);
                    }
                    String x = JOptionPane.showInputDialog("Desea crear maestros[s/n]");
                    r = x.charAt(0);
                    while (r == 's') {
                        crearmaestros(ListaGeneralMaestros);
                        x = JOptionPane.showInputDialog("Desea crear maestros[s/n]");
                        r = x.charAt(0);
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bienvenido al registro, por favor llene el formulario");
                    Registro();
                    Matricula();
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            String ciclo = JOptionPane.showInputDialog("Desea continuar[s/n]");
            s = ciclo.charAt(0);
        }
    }
    
    public static int Menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1: Administracion\n2:Matricula\n3:Log in"));
        return opcion;
    }

    //En la sección de Matricula, primero se deberán registrar los alumnos, que poseen un nombre, número
    //de cuenta, carrera, edad, dinero disponible, usuario, contraseña, clases que está cursando (solo contara
    public static void Registro() {
        contv = 0;
        a.Setnombre(JOptionPane.showInputDialog("Ingrese su nombre: "));
        a.Setnumc(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta: ")));
        a.Setcarrera(JOptionPane.showInputDialog("Ingrese su carrera: "));
        a.Setedad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ")));
        a.Setdinero(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su dinero disponible: ")));
        a.Setusuario(JOptionPane.showInputDialog("Ingrese su usuario: "));
        a.Setcontra(JOptionPane.showInputDialog("Ingrese su contraseña: "));
        String clase = "";
        boolean salir = false;
        for (int i = 0; i < 10; i++) {
            clase = JOptionPane.showInputDialog("Ingrese el codigo de las clases que esta cursando(una a una): ");
            if (contv == ListaGeneralClases.size()) {
                clase = JOptionPane.showInputDialog("Vuela a ingresar la clase");
                i--;
            }
            for (int j = 0; j < ListaGeneralClases.size(); j++) {
                if (clase.equals(ListaGeneralClases.get(j))) {
                    salir = true;
                    break;
                } else {
                    contv++;
                }
            }
            if (salir == true) {
                break;
            }
            if (contv == ListaGeneralClases.size()) {
                JOptionPane.showMessageDialog(null, "Clase ingresada no existe");
                i--;
            }
        }
        if (contv != ListaGeneralClases.size()) {
            a.clases.add(clase);
            a.Setclases(a.clases);
            contv = 0;
        }
        ListaGeneralAlumnos.add("" + a.Getnombre() + "<" + a.Getnumc() + "<" + a.Getedad() + "<"
                + a.Getcarrera() + "<" + a.Getcontra() + "<" + a.Getusuario() + "<" + a.Getdinero() + "<");
    }
    
    public static ArrayList crearclases(ArrayList<String> ListaGeneralClases) {
        char r = ' ';
        String valida = "";
        c.Setnombre(JOptionPane.showInputDialog("Ingrese el nombre de la clase: "));
        boolean cc = false;
        while (cc == false) {
            c.Setseccion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la clase: ")));
            if (ListaGeneralClases.contains(c.Getseccion() + "")) {
                JOptionPane.showMessageDialog(null, "Codigo ya existe");
            } else {
                cc = true;
            }
        }
        c.Setcantmaxalum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de alumnos: ")));
        c.Setunidades(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades de la clase: ")));
        while (r == 's' && c.alumnos.size() <= c.Getcantmaxalum()) {
            c.alumnos.add(JOptionPane.showInputDialog("Ingrese los alumnos de uno en uno"));
            String x = JOptionPane.showInputDialog("Desea seguir metiendo alumnos[s/n]: ");
            r = x.charAt(0);
        }
        ListaGeneralClases.add("" + c.Getseccion());
        return ListaGeneralClases;
    }

    //Los maestros cuentan con un nombre, titulo, maestra, salario, Usuario, Contraseña, Cantidad máxima de
    //clases y una lista de clases que imparte (esta lista solo contara con la sección de la clase). 
    public static ArrayList crearmaestros(ArrayList ListaGeneralMaestros) {
        m.Setnombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        m.Setcontra(JOptionPane.showInputDialog("Ingrese una contraseña: "));
        m.Setmaestria(JOptionPane.showInputDialog("Ingrese su maestria"));
        m.Settitulo(JOptionPane.showInputDialog("Ingrese su titulo"));
        m.Setusuario(JOptionPane.showInputDialog("Ingrese un usuario"));
        m.Setcantmaxclases(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de sus clases")));
        m.Setsalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario")));
        int conta = 0, contcla = 0;
        char n = ' ';
        boolean valid = false;
        while (conta < m.Getcantmaxclases() || n == 's') {
            m.listaclases.add(JOptionPane.showInputDialog("Ingrese el codigo de las clases que lleva una a una"));
            for (int i = 0; i < ListaGeneralClases.size(); i++) {
                if (m.listaclases.get(conta).equals(ListaGeneralClases.get(i))) {
                    String[] Tokens = Clasesinf.get(conta).split("<");
                    if (Tokens[0].equals(null)) {
                        c.Setnombre(m.Getnombre());
                        Clasesinf.remove(conta);
                        Clasesinf.add(conta, m.Getnombre() + "<" + c.Getalumnos() + "<" + c.Getseccion() + "<"
                                + c.Getcantmaxalum() + "<" + c.Getunidades() + "<" + c.Getnombre() + "<");
                    } else {
                        JOptionPane.showMessageDialog(null, "Clase ya esta ocupada");
                        valid = true;
                        break;
                    }
                    break;
                } else {
                    contcla++;
                }
            }
            if (valid == true) {
                continue;
            }
            if (contcla == ListaGeneralClases.size()) {
                JOptionPane.showMessageDialog(null, "Clase no existe");
            }
            String g = JOptionPane.showInputDialog("Desea seguir ingresando clases[s/n]");
            n = g.charAt(0);
            conta++;
        }
        ListaGeneralMaestros.add(m.Getnombre() + "<" + m.Getcontra() + "<" + m.Getmaestria() + "<"
                + m.Gettitulo() + "<" + m.Getusuario() + "<" + m.Getcantmaxclases() + "<" + m.Getsalario() + "<"
                + m.Getlistaclases());
        return ListaGeneralMaestros;
    }
    
    public static void Matricula() {
        String nombresecc = "";
        String[] nom;
        for (int i = 0; i < Clasesinf.size(); i++) {
            nom = Clasesinf.get(i).split("<");
            nombresecc += nom[5] + "  " + nom[2] + "\n";
        }
        JOptionPane.showMessageDialog(null, nombresecc);
    }
}
