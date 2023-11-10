package defecto;

import java.awt.EventQueue;

import frame.Ventana;
import frame.VentanaPrincipal;

public class Principal {

	 public static void main(String[] args) {
	        VentanaPrincipal frame = new VentanaPrincipal();

	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
}
