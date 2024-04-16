package Vista;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    private JPanel pPrincipal;
    private JButton salirButton;
    private JMenuItem altaPersonasMenu;
    private JMenuItem bajaPersonasMenu;
    private JMenuItem modificacionPersonasMenu;
    private JMenuItem altaInmueblesMenu;
    private JMenuItem bajaInmueblesMenu;
    private JMenuItem modificacionInmueblesMenu;
    private JMenu precioConsultaInmueblesMenu;
    private JMenu metrosConsultaInmueblesMenu;
    private JMenu calleConsultaInmueblesMenu;

    public VentanaPrincipal(){
        this.setContentPane(pPrincipal);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void añadirBotonSalir(ActionListener listener) {
        salirButton.addActionListener(listener);
    }

    public void añadirMenuALtaPersonas(ActionListener listener) {
        altaPersonasMenu.addActionListener(listener);
    }

    public void añadirMenuBajaPersonas(ActionListener listener) {
        bajaPersonasMenu.addActionListener(listener);
    }

    public void añadirMenuModificacionPersonas(ActionListener listener) {
        modificacionPersonasMenu.addActionListener(listener);
    }

    public void añadirMenuAltaInmuebles(ActionListener listener) {
        altaInmueblesMenu.addActionListener(listener);
    }

    public void añadirMenuBajaInmuebles(ActionListener listener) {
        bajaInmueblesMenu.addActionListener(listener);
    }

    public void añadirMenuModificacionInmuebles(ActionListener listener) {
        modificacionInmueblesMenu.addActionListener(listener);
    }

    public void añadirMenuPrecioConsultaInmuebles(ActionListener listener) {
        precioConsultaInmueblesMenu.addActionListener(listener);
    }

    public void añadirMenuLocalidadConsultaInmuebles(ActionListener listener) {
        metrosConsultaInmueblesMenu.addActionListener(listener);
    }

    public void añadirMenuCalleConsultaInmuebles(ActionListener listener) {
        calleConsultaInmueblesMenu.addActionListener(listener);
    }
}
