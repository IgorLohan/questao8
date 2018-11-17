package funcionario;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		Salario sal = new Salario();
		
		sal.nome = JOptionPane.showInputDialog(null, "Nome", "Dados do funcionario", 1);
		
		sal.salarioBruto = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario Bruto", "Dados do funcionario", 1));
		
		JOptionPane.showMessageDialog(null, sal.salarioAReceber(), "Salario final", 1);
		
	}

}
