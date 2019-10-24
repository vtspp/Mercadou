
public class Empregado {

	private String nome;
	private String departamento;
	private double salario;

	public Empregado(String nome, String departamento, double salario) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
	}

	public void aumentarSalario(double percentual) {
		salario = (1 + percentual / 100) * salario;
	}

	public class Supervisor extends Empregado {

	private String secretaria;

	public Supervisor(String nome, String departamento, double salario, String secretaria) {
		super(nome, departamento, salario);
		this.secretaria = secretaria;

	}
	
	public void aumentarSalario(double percentual) {
		super.aumentarSalario(percentual + 0.5);
	}
	
	public String getSecretaria() {
		return this.secretaria;
	}
	
	public void setSecretaria() {
		this.secretaria = secretaria;
	}

	}

	public static void main(String[] args) {
		
		/*Empregado jo�o = new Empregado ("Jo�o", "Vendas", "2000");
		Empregado maria = new Supervisor ("Maria", "Supervis�o", "3000", "Ana");
		jo�o.aumentarSalario(100);
		maria.aumentarSalario(100);
		System.out.println(jo�o.salario);
		System.out.println(maria.salario);*/

	}

}
