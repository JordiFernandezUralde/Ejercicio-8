package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaAltaPersonas extends JFrame{
    private JTextField tfNombre;
    private JTextField tfDni;
    private JButton bSalir;
    private JButton bAceptar;
    private JPanel pPrincipal;

    public VentanaAltaPersonas() throws HeadlessException {
        super("Ventana Alta Personas");
        setContentPane(pPrincipal);
        setSize(500,500);
        setLocationRelativeTo(null);
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public void setTfNombre(JTextField tfNombre) {
        this.tfNombre = tfNombre;
    }

    public JTextField getTfDni() {
        return tfDni;
    }

    public void setTfDni(JTextField tfDni) {
        this.tfDni = tfDni;
    }

    public void addBAceptarAL(ActionListener listener){
        bAceptar.addActionListener(listener);
    }
    public void addBSalirAL(ActionListener listener){
        bSalir.addActionListener(listener);
    }
}
