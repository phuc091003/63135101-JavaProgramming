/**
 * 
 */
package ntu_63135101;

import javax.swing.SwingUtilities;

/**
 * 
 */
public class DoiDonViDo {

	
	public static void main (String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				form app = new form();
				app.showform();
			}
		});
	}
}

