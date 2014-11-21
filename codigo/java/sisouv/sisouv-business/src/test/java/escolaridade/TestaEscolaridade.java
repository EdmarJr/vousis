package escolaridade;


import org.junit.Test;

import br.jus.stj.sisouv.entity.schemas.sisouv.Escolaridade;

public class TestaEscolaridade {

	@Test
	public void testaObjeto(){
		
		Escolaridade e;
		e = new Escolaridade();
		
		long id =2;
		
		e.setId(id);
		e.setDescricaoGrauEscolaridade("graduação");
		
		System.out.println(e.getId());
		System.out.println(e.getDescricaoGrauEscolaridade());
		
	}
}
