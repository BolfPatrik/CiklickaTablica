package edunova;

import javax.swing.JOptionPane;

public class CiklickaTablica {
public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		int tablica[][] = new int[x][y];
		tablica[x-1][y-1]=1;
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.printf("%3d", tablica[i][j]);
	        }
	        System.out.println();
	      }		
			}	
}
