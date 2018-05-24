import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj:"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj:"));	
		
		int suma= prvi + drugi;
		
		System.out.println("  " + prvi);
		System.out.println("+ " + drugi);
		System.out.println("  __");
		System.out.println("  " + suma);

	}

}
