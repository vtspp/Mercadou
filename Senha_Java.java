import java.util.Scanner;

public class Senha_Java {

	public static void main(String[] args) {
		
		/*Entrada de dados para cadastro da senha.
		Scanner criarSenha = new Scanner (System.in);
		System.out.println("Nova senha: ");
		String senha = criarSenha.next();
		int tamanhoSenha = senha.length();
		
		Condicional para verificar o tamanho da senha digitada.
		if (tamanhoSenha < 8) {
			System.out.println("Senha inv�lida. Digite novamente uma senha que contenha entre 8 a 10 dig�tos.");
		}else if (tamanhoSenha > 10){
			System.out.println("Senha inv�lida. A senha n�o deve conter mais que 10 dig�tos.");
		}else {
			System.out.println("Senha cadastrada com sucesso.");
		}
		
		System.out.println("______________________________________________");*/
		
		Scanner user = new Scanner (System.in);
		
		System.out.println("** Cadastro de novo usu�rio **");
		
		System.out.println("Digite um nome para ser usado como usu�rio: ");
		String usuario = user.next();
		Scanner criarSenha = new Scanner (System.in);
		System.out.println("Nova senha: ");
		String senha = criarSenha.next();
		int tamanhoSenha = senha.length();
		
		//Condicional para verificar o tamanho da senha digitada.
		if (tamanhoSenha < 8) {
			System.out.println("Senha inv�lida. Digite novamente uma senha que contenha entre 8 a 10 dig�tos.");
		}else if (tamanhoSenha > 10){
			System.out.println("Senha inv�lida. A senha n�o deve conter mais que 10 dig�tos.");
		}else {
			System.out.println("Senha cadastrada com sucesso.");
		}
		System.out.println("______________________________________________");
		
		System.out.println("********** Tela de Login *********");
		String senhaCadastro = senha;;
		String userCadastro = usuario;
		System.out.println("Usu�rio: ");
		String userLogin = user.next();
		System.out.println("Senha: ");
		String senhaLogin = user.next();
		//Condicional de verifica��o
		if (userLogin.equals(userCadastro) == true && senhaLogin.equals(senhaCadastro) == true){
			System.out.println("Bem vindo " + userCadastro);
		}else {
			System.out.println("Usu�rio ou Senha inv�lida.");
		}
		

	}

}
