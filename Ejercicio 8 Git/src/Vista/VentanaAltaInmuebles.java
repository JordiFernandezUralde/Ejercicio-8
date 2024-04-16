package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAltaInmuebles extends JFrame{
    private JTextField tfCalle;
    private JTextField tfMetros;
    private JTextField tfPrecio;
    private JButton bAceptar;
    private JButton bCancelar;
    private JPanel pPrincipal;

    public VentanaAltaInmuebles() throws HeadlessException {
        super("Ventana alta inmuebles");
        setSize(500,300);
        setContentPane(pPrincipal);
        setLocationRelativeTo(null);
    }

    public JTextField getTfCalle() {
        return tfCalle;
    }

    public void setTfCalle(JTextField tfCalle) {
        this.tfCalle = tfCalle;
    }

    public JTextField getTfMetros() {
        return tfMetros;
    }

    public void setTfMetros(JTextField tfMetros) {
        this.tfMetros = tfMetros;
    }

    public JTextField getTfPrecio() {
        return tfPrecio;
    }

    public void setTfPrecio(JTextField tfPrecio) {
        this.tfPrecio = tfPrecio;
    }

    public JButton getbAceptar() {
        return bAceptar;
    }

    public void setbAceptar(JButton bAceptar) {
        this.bAceptar = bAceptar;
    }

    public JButton getbCancelar() {
        return bCancelar;
    }

    public void setbCancelar(JButton bCancelar) {
        this.bCancelar = bCancelar;
    }
}
