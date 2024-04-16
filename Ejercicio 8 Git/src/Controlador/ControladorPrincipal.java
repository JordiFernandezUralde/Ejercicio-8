package Controlador;

import Modelo.Personas;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorPrincipal {
    private VentanaPrincipal vp;
    private VentanaAltaPersonas vap;
    private VentanaBajaPersonas vbp;
    private VentanaModificacionPersonas vmp;
    private VentanaAltaInmuebles vai;
    private VentanaBajaInmueble vbi;
    private VentanaModifiInmuebles vmi;

    private final ArrayList<Personas> listaPersonas;

    public ControladorPrincipal() {
        vp = new VentanaPrincipal();
        vp.setVisible(true);

        listaPersonas = new ArrayList<>();

        vp.añadirBotonSalir(new controlarBotonSalir());

        /* ------ PERSONAS ------ */
        vp.añadirMenuALtaPersonas(new controlarMenuAltaPersonas(listaPersonas));
        vp.añadirMenuBajaPersonas(new controlarMenuBajaPersonas());
        vp.añadirMenuModificacionPersonas(new controlarMenuModificacionPersonas());

        /* ------ INMUEBLES ------ */
        vp.añadirMenuAltaInmuebles(new controlarMenuAltaInmuebles());
        vp.añadirMenuBajaInmuebles(new controlarMenuBajaInmuebles());
        vp.añadirMenuModificacionInmuebles(new controlarMenuModificacionInmuebles());

        /* ------ CONSULTAS INMUEBLES ------ */
        vp.añadirMenuPrecioConsultaInmuebles(new controlarMenuPrecioConsultaInmuebles());
        vp.añadirMenuLocalidadConsultaInmuebles(new controlarMenuMetrosConsultaInmuebles());
        vp.añadirMenuCalleConsultaInmuebles(new controlarMenuCalleConsultaInmuebles());
    }

    public class controlarBotonSalir implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /* ------ PERSONAS ------ */

    public class controlarMenuAltaPersonas implements ActionListener {
        private ArrayList<Personas> listaPersonas;

        public controlarMenuAltaPersonas(ArrayList<Personas> listaPersonas) {
            this.listaPersonas = listaPersonas;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Aquí agregas el código para manejar la acción del botón de alta de personas
            // Por ejemplo, puedes llamar a un método que realice la lógica para dar de alta una persona
            darDeAltaPersona("12345678A", "Juan Perez");
        }

        public void darDeAltaPersona(String dni, String nombre) {
            // Aquí puedes agregar la lógica para dar de alta una persona
            // Por ejemplo, puedes crear un objeto Persona y agregarlo a la lista
            Personas persona = new Personas(dni, nombre);
            listaPersonas.add(persona);
            System.out.println("Persona añadida correctamente: " + persona);
        }
    }

    public class controlarMenuBajaPersonas implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    public class controlarMenuModificacionPersonas implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    /* ------ INMUEBLES ------ */

    public class controlarMenuAltaInmuebles implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    public class controlarMenuBajaInmuebles implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class controlarMenuModificacionInmuebles implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    /* ------ CONSULTAS INMUEBLES ------ */

    public class controlarMenuPrecioConsultaInmuebles implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    public class controlarMenuMetrosConsultaInmuebles implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    public class controlarMenuCalleConsultaInmuebles implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}