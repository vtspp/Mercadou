  var dividendo = prompt ('Dígite um número para saber se é primo:')
        var divisor;
        var controle = 0;
        
        for (divisor = 1; divisor <= dividendo; divisor++) {

			if (dividendo % divisor == 0) {

				controle++;
			}
		}

		if (controle == 2) {
			document.write('O número '+ dividendo +' é primo.');
		} else {
			document.write('O número '+ dividendo +' não é primo.');
		}