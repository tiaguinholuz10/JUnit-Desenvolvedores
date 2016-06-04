import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TesteJunitSalario {
	
	
	@Test
	public void testSalarioAnual(){
		Double salario = 1D;
		FuncionarioService funcionarioService = new FuncionarioService();
		Double result = funcionarioService.calculadoraSalarioAnual(salario);
		assertEquals(new Double(12D), new Double(result));
		
		
		
		
	}

}
