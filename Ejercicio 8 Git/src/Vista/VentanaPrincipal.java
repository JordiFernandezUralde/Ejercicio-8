package Vista;

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
    private JPanel pPrincipal;
    private JButton salirButton;

    public VentanaPrincipal(){
        this.setContentPane(pPrincipal);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
