  var dividendo = prompt ('Dígite um número para saber se é primo:')//Entrada de dados
        var divisor;
        var controle = 0;
        
        for (divisor = 1; divisor <= dividendo; divisor++) {

			if (dividendo % divisor == 0) {//Verifica se resto da divisão é zero, caso seja, o marcador controle recebe um valor.

				controle++;
			}
		}

		if (controle == 2) {//Se o controle receber 2, significa que houve duas divisões com resto zero, sendo assim, o valor é primo.
			document.write('O número '+ dividendo +' é primo.');
		} else {
			document.write('O número '+ dividendo +' não é primo.');
		}
