package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaBajaPersonas extends JFrame{
    private JTextField tfDni;
    private JButton bSalir;
    private JButton bAceptar;
    private JPanel pPrincipal;
    public VentanaBajaPersonas() throws HeadlessException {
        super("Ventana Baja Personas");
        setContentPane(pPrincipal);
        setSize(500,500);
        setLocationRelativeTo(null);
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
