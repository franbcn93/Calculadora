package calculadoragui;

import javax.swing.SwingUtilities;

import calculadoragui.vista.InterficieInicial;

public class CalculadoraGUI {
    /**
     * Metode de la MainClass on es crida a la interficie inicial i es posa visible.
     * @param args 
     */
	
    public static void main(String[] args) {
                            SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            InterficieInicial intin = new InterficieInicial();
                            intin.setVisible(true);
                        }
                    });
        
    }

}
