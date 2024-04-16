package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaModificacionPersonas extends JFrame{
    private JPanel pPrincipal;
    private JTextField tfDni;
    private JTextField tfNombre;
    private JButton bSalir;
    private JButton bAceptar;
    public VentanaModificacionPersonas() throws HeadlessException {
        super("Ventana Modificacion Personas");
        setContentPane(pPrincipal);
        setSize(500,500);
        setLocationRelativeTo(null);
    }

    public JPanel getpPrincipal() {
        return pPrincipal;
    }

    public void setpPrincipal(JPanel pPrincipal) {
        this.pPrincipal = pPrincipal;
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
