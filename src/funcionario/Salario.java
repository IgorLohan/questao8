package funcionario;

public class Salario {
	
	String nome;
	double salarioBruto;
	
	public double calINSS() {
		
		double salario = this.salarioBruto;
		
		if(salario >= 2000) {			
			salario -= (salario * 0.11);			
		}else {			
			salario -= (salario * 0.8);			
		}
		
		return salario;
		
	}
	
	public double calIR() {
		
		double salarioFinal = calINSS();
		
		if(salarioFinal > 2500) {			
			salarioFinal -= (salarioFinal * 0.25);			
		}else if( salarioFinal > 2000 && salarioFinal < 2500) {			
			salarioFinal -= (salarioFinal * 0.20);			
		}else {			
			salarioFinal -= (salarioFinal * 0.12);			
		}
		
		return salarioFinal;
		
	}
	
	 String salarioAReceber() {
		
		return "Funcionario: " + this.nome + ", seu salario final é: R$" + calIR();
		
	}
}
