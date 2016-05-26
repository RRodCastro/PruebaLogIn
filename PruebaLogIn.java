
	import javax.swing.*;

public class PruebaLogIn {
		public static void main( String args[] )
		{
		    JFrame.setDefaultLookAndFeelDecorated(true);
		    try {
		    	UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			}
			catch (Exception e){   
				System.out.println(e);
			}
			Login aplicacion = new Login();
			
			
			aplicacion.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		} 
	}

