
package code;
import javax.swing.JOptionPane;

public class VerificaNumerosAmigos {

	
	/**
	 * @author Esther
	 * La clase nos verifica si dos numeros son amigos o no
	 
	 * Dos números son amigos cuando la suma de los divisores de uno da como resultado el otro y viceversa.
	 * Por ejemplo: 220 y 284 son amigos.
	 * /
	 */
    public void verificador() {
        String entrada;

        entrada = JOptionPane.showInputDialog("Introducir 1er número");
        int x = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Introducir 2º número");
        int y = Integer.parseInt(entrada);
        
        if (this.comprobarSiAmigos(x,y)) {
            JOptionPane.showMessageDialog(null, x + " es amigo de " + y);
        } else {
            JOptionPane.showMessageDialog(null, x + " no es amigo de " + y);
        }        
    }
    /**
     * 
     * @param x numero a
     * @param y numero b
     * @return true o false si son o no amigos
     * mediante el metodo verificamos
     */
   public boolean comprobarSiAmigos(int x, int y) {
    	int i, z = 0;
    	
    	for (i = 1; i < x; i++) {
            if (x % i == 0) {
                z = z + i;
            }
        }

        if (z == y) {
            z = 0;
            for (i = 1; i < y; i++) {
                if (y % i == 0) {
                    z = z + i;
                }
            }

            if (z == x) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
