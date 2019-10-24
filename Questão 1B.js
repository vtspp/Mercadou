var str = prompt("digite 6 caracteres entre (), {}, []")
        var pilha = ['(', ')', '{', '}', '[',']'];
        
        for( i = 0; i < pilha.length; i++){
            
            if(str.charAt(i) == pilha[0])
                pilha.push('(');
            else if(str.charAt(i) == pilha[2])
                pilha.push('{');
            else if(str.charAt(i) == pilha[4])
                pilha.push('[');
            
            else if(str.charAt(i) == pilha[1])
                 if(pilha.isEmptyObject)
                document.write('Não está balanceado')
                 if(pilha.pop() != pilha[0])
                document.write('Não está balanceado')
            else if{
                document.write("Está Balanceado")
            }//fim da pilha[1]*/
            
            else if(str.charAt(i) == pilha[3])
                 if(pilha.isEmptyObject)
                document.write('Não está balanceado')
                 if(pilha.pop() != pilha[2])
                document.write('Não está balanceado')
            else if{
                document.write("Está Balanceado")
            }//fim da pilha[2]*/
            
            else if(str.charAt(i) == pilha[5])
                 if(pilha.isEmptyObject)
                document.write('Não está balanceado')
                 if(pilha.pop() != pilha[4])
                document.write('Não está balanceado')
            else {
                document.write("Está Balanceado")
            }//fim da pilha[4]*/
            
        }
