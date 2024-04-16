package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaBajaInmueble extends JFrame {
    private JTextField tfCalle;
    private JButton bAceptar;
    private JButton bCancelar;
    private JPanel pPrincipal;

    public VentanaBajaInmueble() throws HeadlessException {
        super("Ventana baja inmuebles");
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
