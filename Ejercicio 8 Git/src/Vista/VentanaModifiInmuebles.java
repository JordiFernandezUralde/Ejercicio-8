package Vista;

import javax.swing.*;

public class VentanaModifiInmuebles extends JFrame {

    private JTextField tfNombreCalle;
    private JTextField tfPrecio;
    private JTextField tfMetros;
    private JPanel pPrincipal;
    private JButton bAceptar;
    private JButton bCancelar;

    public VentanaModifiInmuebles() {
        super("Ventana modificacion inmuebles");
        setSize(500,300);
        setContentPane(pPrincipal);
        setLocationRelativeTo(null);
    }

    public JTextField getTfNombreCalle() {
        return tfNombreCalle;
    }

    public void setTfNombreCalle(JTextField tfNombreCalle) {
        this.tfNombreCalle = tfNombreCalle;
    }

    public JTextField getTfPrecio() {
        return tfPrecio;
    }

    public void setTfPrecio(JTextField tfPrecio) {
        this.tfPrecio = tfPrecio;
    }

    public JTextField getTfMetros() {
        return tfMetros;
    }

    public void setTfMetros(JTextField tfMetros) {
        this.tfMetros = tfMetros;
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
