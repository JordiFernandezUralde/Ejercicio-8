package Controlador;

import Vista.VentanaAltaPersonas;
import Vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal {
    private VentanaPrincipal vp;
    private VentanaAltaPersonas vap;

    public ControladorPrincipal() {
        vp = new VentanaPrincipal();
        vp.setVisible(true);

        vp.añadirBotonSalir(new controlarBotonSalir());

        /* ------ PERSONAS ------ */
        vp.añadirMenuALtaPersonas(new controlarMenuAltaPersonas());
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
        @Override
        public void actionPerformed(ActionEvent e) {
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

