package calculadoragui;

import calculadoragui.vista.InterficieGrafica;
import javax.swing.SwingUtilities;

public class CalculadoraGUI {

    public static void main(String[] args) {
                            SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            InterficieGrafica intGraf = new InterficieGrafica();
                            intGraf.setVisible(true);
                        }
                    });
        
    }

}
