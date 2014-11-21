/**
 * 
 */

function colocarPrimeirasLetrasMaiusculas(element) {
	var stringElemento = element.value;
	var palavraRetorno = "";
	var palavras = stringElemento.split(' ');
	for(var i = 0; i < palavras.length; i++) {
		if(i != 0) {
			palavraRetorno = palavraRetorno + " "; 
		}
		if(palavras[i].length > 2) {
		palavraRetorno = palavraRetorno + palavras[i].substring(0,1).toUpperCase() + palavras[i].substring(1,palavras[i].length).toLowerCase(); 
		} else {
			palavraRetorno = palavraRetorno + palavras[i];
		}
		
		
	}
	
	element.value = palavraRetorno;
	
	
}