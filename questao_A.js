  var dividendo = prompt ('D�gite um n�mero para saber se � primo:')
        var divisor;
        var controle = 0;
        
        for (divisor = 1; divisor <= dividendo; divisor++) {

			if (dividendo % divisor == 0) {

				controle++;
			}
		}

		if (controle == 2) {
			document.write('O n�mero '+ dividendo +' � primo.');
		} else {
			document.write('O n�mero '+ dividendo +' n�o � primo.');
		}