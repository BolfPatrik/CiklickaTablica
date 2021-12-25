package edunova;

import javax.swing.JOptionPane;

public class CiklickaTablica {
public static void main(String[] args) {
    while(true) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		int tablica[][] = new int[x][y];
        if(x<1 && y<1) {
			JOptionPane.showMessageDialog(null, "Unesi broj veći od nule barem na jednom od dva unosa");
			continue;
        }
    }
		
}
}

